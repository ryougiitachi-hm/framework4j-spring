package per.itachi.framework4j.spring.retry.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import per.itachi.framework4j.spring.retry.infra.restful.usersvc.UserPort;

@RestController
@RequestMapping("/retry")
public class RetryController {

    @Autowired
    private UserPort userPort;

    @PostMapping("/v1/users")
    @ResponseStatus(HttpStatus.OK)
    public void addUser() {
        userPort.addUser();
    }
}