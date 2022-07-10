package per.itachi.framework4j.spring.retry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.retry.annotation.EnableRetry;

@SpringBootApplication
@EnableRetry // required, or won't be enabled
public class RetryApp {

    public static void main(String[] args) {
        SpringApplication.run(RetryApp.class, args);
    }

}
