package per.itachi.framework4j.spring.cloud.client.consumer.joint.controller;

import java.time.LocalDate;
import java.util.UUID;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.itachi.framework4j.spring.cloud.client.consumer.app.dto.CustomerDto;

@RestController
@RequestMapping("/v1/customers")
public class CustomerController {

    @Value("${server.port}")
    private int port;

    @GetMapping("/idCard/{idCard}")
    public CustomerDto getCustomerByIdCard(@PathVariable("idCard") String idCard) {
        CustomerDto dto = new CustomerDto();
        dto.setName(String.valueOf(port));
        dto.setIdCard(UUID.randomUUID().toString());
        dto.setBirthday(LocalDate.now());
        return dto;
    }
}
