package per.itachi.framework4j.spring.cloud.openfeign.joint.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import per.itachi.framework4j.spring.cloud.openfeign.infra.restful.entity.CustomerResponse;
import per.itachi.framework4j.spring.commons.constant.UrlConstants;

@Slf4j
@RestController
@RequestMapping("/resttemplate")
public class RestTemplateController {

    private static final String SVC_NAME_CUSTOMER = "spring-cloud-customer";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(UrlConstants.CUSTOMER_SVC_CUSTOMER_BY_ID_CARD_V1)
    public String getCustomerByIdCard(@PathVariable String idCard) {
        String url = String.format("http://%s%s", SVC_NAME_CUSTOMER, UrlConstants.CUSTOMER_SVC_CUSTOMER_BY_ID_CARD_V1);
        CustomerResponse response = restTemplate.getForObject(url, CustomerResponse.class, idCard);
        log.info("CustomerResponse for getCustomerByIdCard is {}. ",response);
        return response.getName();
    }

    @GetMapping(UrlConstants.CUSTOMER_SVC_CUSTOMER_BY_CUST_NBR_V1)
    public String getCustomerByCustNbr(@PathVariable String customerNbr) {
        String url = String.format("http://%s%s", SVC_NAME_CUSTOMER, UrlConstants.CUSTOMER_SVC_CUSTOMER_BY_CUST_NBR_V1);
        CustomerResponse response = restTemplate.getForObject(url, CustomerResponse.class, customerNbr);
        log.info("CustomerResponse for getCustomerByCustNbr is {}. ",response);
        return response.getName();
    }
}
