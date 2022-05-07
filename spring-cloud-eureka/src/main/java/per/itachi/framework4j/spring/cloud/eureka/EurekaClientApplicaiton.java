package per.itachi.framework4j.spring.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaClientApplicaiton {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplicaiton.class, args);
    }

}
