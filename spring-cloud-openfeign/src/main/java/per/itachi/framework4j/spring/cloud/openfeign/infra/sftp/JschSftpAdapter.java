package per.itachi.framework4j.spring.cloud.openfeign.infra.sftp;

import javax.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import per.itachi.framework4j.spring.cloud.openfeign.infra.sftp.config.SftpProperties;

@Slf4j
@Component
public class JschSftpAdapter implements SftpPort{

    @Resource
    private SftpProperties commonSftpProperties;

    @Value("${infra.sftp.common.basePath}") // non-automatically
    private String basePath;

    @Override
    public void downloadFrDocument(String serialNo) {
        log.info("downloading file,  commonSftpProperties={}, basePath={}. ",
                commonSftpProperties, basePath);
    }

}
