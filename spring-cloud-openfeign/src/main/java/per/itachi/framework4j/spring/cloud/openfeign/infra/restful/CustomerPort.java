package per.itachi.framework4j.spring.cloud.openfeign.infra.restful;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import per.itachi.framework4j.spring.cloud.openfeign.infra.restful.entity.CustomerResponse;
import per.itachi.framework4j.spring.commons.constant.UrlConstants;

@FeignClient(name = "spring-cloud-customer", fallback = CustomerPortFallback.class)
public interface CustomerPort {

//    @CircuitBreaker(name = "customer-svc") // does work, and the embedded cb also works
    @GetMapping(UrlConstants.CUSTOMER_SVC_CUSTOMER_BY_ID_CARD_V1)
    CustomerResponse getCustomerByIdCard(@PathVariable("idCard") String idCard);

    @GetMapping(UrlConstants.CUSTOMER_SVC_CUSTOMER_BY_CUST_NBR_V1)
    CustomerResponse getCustomerByCustNbr(@PathVariable("customerNbr") String customerNbr);
}
