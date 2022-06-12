package per.itachi.framework4j.spring.cloud.openfeign.infra.restful;

import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class CustomerPortFallbackFactory implements FallbackFactory<CustomerPortFallbackMock> {

    @Override
    public CustomerPortFallbackMock create(Throwable cause) {
        return new CustomerPortFallbackMock(cause);
    }
}