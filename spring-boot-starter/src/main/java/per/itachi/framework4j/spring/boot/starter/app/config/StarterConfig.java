package per.itachi.framework4j.spring.boot.starter.app.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import per.itachi.framework4j.spring.boot.starter.app.service.StarterService;
import per.itachi.framework4j.spring.boot.starter.app.service.impl.StarterServiceImpl;

@Configuration
@ConditionalOnClass({StarterService.class, StarterServiceImpl.class})
public class StarterConfig {

    @Bean
    @ConditionalOnMissingBean
    public StarterService initStarterService() {
        return new StarterServiceImpl();
    }
}
