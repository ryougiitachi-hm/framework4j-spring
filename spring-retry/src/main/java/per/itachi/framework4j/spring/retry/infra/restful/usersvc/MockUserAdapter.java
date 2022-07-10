package per.itachi.framework4j.spring.retry.infra.restful.usersvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;
import per.itachi.framework4j.spring.retry.infra.restful.usersvc.dto.UserDTO;

@Slf4j
@Component
public class MockUserAdapter implements UserPort{

    @Retryable(maxAttempts = 1, listeners = {"restfulRetryListener"},
//            interceptor = "retryMethodInterceptor", // may block retry
            backoff = @Backoff(delay = 100L, multiplier = 2.0))
    @Override
    public UserDTO addUser() {
        log.info("Calling ... ");
        throw new RuntimeException("retry");
//        return new Object();
    }

    @Recover
    private UserDTO addUserRecover(RuntimeException e) {
        UserDTO dto = new UserDTO();
        dto.setId(-1L);
        return dto;
    }
}
