package per.itachi.framework4j.spring.retry.infra.restful.retry;

import lombok.extern.slf4j.Slf4j;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class RetryMethodInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation invocation) throws Throwable {
        log.info("calling, invocation={}. ", invocation);
        try {
//            return invocation.proceed();
            return null;
        }
        finally {
            // not useful
        }
    }
}