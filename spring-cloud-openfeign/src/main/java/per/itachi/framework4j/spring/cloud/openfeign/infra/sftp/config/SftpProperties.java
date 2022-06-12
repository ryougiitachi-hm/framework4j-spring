package per.itachi.framework4j.spring.cloud.openfeign.infra.sftp.config;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class SftpProperties {

    private String host;

    private String port;

    private String username;

    private String password;

    private String basePath;
}
