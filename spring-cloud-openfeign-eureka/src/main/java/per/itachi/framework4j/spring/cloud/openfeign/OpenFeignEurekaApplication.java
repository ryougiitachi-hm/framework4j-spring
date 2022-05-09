package per.itachi.framework4j.spring.cloud.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients // required
//@Import(RestfulConfig.class) // it doesn't work
public class OpenFeignEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignEurekaApplication.class, args);
    }

}
