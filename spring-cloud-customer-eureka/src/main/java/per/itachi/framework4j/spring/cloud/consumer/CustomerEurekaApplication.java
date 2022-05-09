package per.itachi.framework4j.spring.cloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CustomerEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerEurekaApplication.class, args);
    }

}
