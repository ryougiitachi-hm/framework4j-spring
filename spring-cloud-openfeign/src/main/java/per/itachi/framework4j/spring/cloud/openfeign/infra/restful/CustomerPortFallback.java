package per.itachi.framework4j.spring.cloud.openfeign.infra.restful;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import per.itachi.framework4j.spring.cloud.openfeign.infra.restful.entity.CustomerResponse;

@Slf4j
@Component
public class CustomerPortFallback implements CustomerPort{

    @Override
    public CustomerResponse getCustomerByIdCard(String idCard) {
        log.error("Error occurred.");
        return new CustomerResponse();
    }

    @Override
    public CustomerResponse getCustomerByCustNbr(String customerNbr) {
        log.error("Error occurred.");
        return new CustomerResponse();
    }
}
