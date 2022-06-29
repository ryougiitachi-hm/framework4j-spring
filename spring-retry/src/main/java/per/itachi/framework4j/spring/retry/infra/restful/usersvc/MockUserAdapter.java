package per.itachi.framework4j.spring.retry.infra.restful.usersvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MockUserAdapter implements UserPort{

    @Retryable(maxAttempts = 5, listeners = {"restfulRetryListener"},
            interceptor = "restfulRetryListener",
            backoff = @Backoff(delay = 100L, multiplier = 2.0))
    @Override
    public Object addUser() {
        log.info("Calling ... ");
        throw new RuntimeException("retry");
//        return new Object();
    }
}
