package per.itachi.framework4j.spring.cloud.nacos.joint.controller;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/v1/users")
public class UserController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/customer/userId/{userId}")
    public String getCustomerByUserId(@PathVariable Long userId) {
        return restTemplate.getForObject(
                "http://spring-cloud-customer/v1/customers/customerNbr/{customerNbr}",
                String.class, UUID.randomUUID().toString());
    }

}
