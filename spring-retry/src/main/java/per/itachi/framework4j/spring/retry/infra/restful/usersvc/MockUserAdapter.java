package per.itachi.framework4j.spring.retry.infra.restful.usersvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.RetryException;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import per.itachi.framework4j.spring.retry.infra.common.exception.RetryableException;
import per.itachi.framework4j.spring.retry.infra.restful.usersvc.dto.UserDTO;

@Slf4j
@Component
public class MockUserAdapter implements UserPort{

    @Retryable(maxAttempts = 5, listeners = {"restfulRetryListener"},
//            interceptor = "retryMethodInterceptor", // may block retry
            backoff = @Backoff(delay = 100L, multiplier = 2.0))
    @Override
    public void addUser() {
        log.info("Calling ... ");
        throw new RetryException("retry");
//        return new Object();
    }

    @Recover
    private void addUserRecover(RuntimeException e) {
        log.info("addUserRecover", e);
        UserDTO dto = new UserDTO();
        dto.setId(-1L);
//        return dto;
    }

    @Override
    public UserDTO getUserById(Long id) {
        return null;
    }

    @Retryable(maxAttempts = 5, //listeners = {"restfulRetryListener"},
//            interceptor = "retryMethodInterceptor", // may block retry
            include = RetryableException.class,
            backoff = @Backoff(delay = 100L, multiplier = 0))
    @Override
    public UserDTO getUserByIdRetryable(Long id) {
        throw new RetryableException("retry");
    }

    /**
     * Recovery method is identified by return type,
     * and not by either method name or list of arguments instead.
     * And exception is also optional but at first place if applicable.
     * */
    @Recover
    private UserDTO getUserByIdRetryable(RuntimeException e, Long id) {
        log.error("getUserByIdRetryable, id={}", id, e);
        return new UserDTO();
    }
}
