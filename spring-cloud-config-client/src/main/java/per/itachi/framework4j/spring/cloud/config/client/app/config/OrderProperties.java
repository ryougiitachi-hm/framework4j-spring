package per.itachi.framework4j.spring.cloud.config.client.app.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;

@ConfigurationProperties("order")
@Getter
@Setter
@ToString
public class OrderProperties {

    private List<String> supportStatus;

    private Map<String, List<String>> process;

}
