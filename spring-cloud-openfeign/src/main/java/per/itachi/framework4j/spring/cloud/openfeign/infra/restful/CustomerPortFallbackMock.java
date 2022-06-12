package per.itachi.framework4j.spring.cloud.openfeign.infra.restful;

import lombok.extern.slf4j.Slf4j;
import per.itachi.framework4j.spring.cloud.openfeign.infra.restful.entity.CustomerResponse;

@Slf4j
public class CustomerPortFallbackMock implements CustomerPort{

    private Throwable throwable;

    public CustomerPortFallbackMock(Throwable throwable) {
        this.throwable = throwable;
    }

    @Override
    public CustomerResponse getCustomerByIdCard(String idCard) {
        log.error("Error occurred.", throwable);
        return new CustomerResponse();
    }

    @Override
    public CustomerResponse getCustomerByCustNbr(String customerNbr) {
        log.error("Error occurred.", throwable);
        return new CustomerResponse();
    }
}
