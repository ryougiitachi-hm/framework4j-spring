package per.itachi.framework4j.spring.retry.infra.restful.usersvc;

import lombok.extern.slf4j.Slf4j;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MockUserAdapter implements UserPort{

    @Retryable
    @Override
    public void addUser() {
        log.info("Calling ... ");
    }
}
