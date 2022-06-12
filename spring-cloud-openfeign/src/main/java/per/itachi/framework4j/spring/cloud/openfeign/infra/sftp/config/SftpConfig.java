package per.itachi.framework4j.spring.cloud.openfeign.infra.sftp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SftpConfig {

    @Bean
    @ConfigurationProperties("infra.sftp.common")
    public SftpProperties commonSftpProperties() {
        return new SftpProperties();
    }
}
