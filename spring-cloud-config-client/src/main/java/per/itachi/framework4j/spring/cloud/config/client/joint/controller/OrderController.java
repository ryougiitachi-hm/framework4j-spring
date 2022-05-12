package per.itachi.framework4j.spring.cloud.config.client.joint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import per.itachi.framework4j.spring.cloud.config.client.app.config.OrderProperties;

@RestController
@RequestMapping("/v1/orders")
public class OrderController {

    @Value("${order.count}")
    private int count;

    @Autowired
    private OrderProperties orderProperties;

    @GetMapping("/configs")
    public OrderProperties getOrderProperties() {
        return this.orderProperties;
    }

}
