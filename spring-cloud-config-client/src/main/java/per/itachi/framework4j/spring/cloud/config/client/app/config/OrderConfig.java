package per.itachi.framework4j.spring.cloud.config.client.app.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OrderConfig {

//    @RefreshScope
    @Bean
    @ConfigurationProperties("order")
    public OrderProperties orderProperties() {
        return new OrderProperties();
    }
}
