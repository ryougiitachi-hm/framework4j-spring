package per.itachi.framework4j.spring.cloud.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
//@EnableNacosDiscovery // seems optional?
@EnableDiscoveryClient
@EnableFeignClients // required for nacos, otherwise open feign instance won't be created.
public class OpenFeignNacosApp {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignNacosApp.class, args);
    }

}
