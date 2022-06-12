package per.itachi.framework4j.spring.cloud.openfeign.joint.controller;

import java.util.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import per.itachi.framework4j.spring.cloud.openfeign.infra.sftp.SftpPort;

@RestController
@RequestMapping("/sftp")
public class SftpController {

    @Autowired
    private SftpPort sftpPort;

    @GetMapping("/fr")
    @ResponseStatus(HttpStatus.OK)
    public void downloadFrDocument() {
        sftpPort.downloadFrDocument(UUID.randomUUID().toString());
    }

}
