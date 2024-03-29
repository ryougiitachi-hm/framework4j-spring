package per.itachi.framework4j.spring.cloud.consumer;

import com.alibaba.nacos.spring.context.annotation.discovery.EnableNacosDiscovery;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableNacosDiscovery
public class CustomerNacosApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerNacosApplication.class, args);
    }

}
