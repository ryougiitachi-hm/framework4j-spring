package per.itachi.framework4j.spring.retry.joint.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import per.itachi.framework4j.spring.retry.infra.restful.usersvc.UserPort;
import per.itachi.framework4j.spring.retry.infra.restful.usersvc.dto.UserDTO;

@Slf4j
@RestController
@RequestMapping("/retry")
public class RetryController {

    @Autowired
    private UserPort userPort;

    @PostMapping("/v1/users")
    @ResponseStatus(HttpStatus.OK)
    public void addUser() {
//        UserDTO dto = userPort.addUser();
        userPort.addUser();
        log.info("Created user");
    }

    @GetMapping("/v1/users/id/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void getUserById(@PathVariable Long id) {
        UserDTO dto = userPort.getUserByIdRetryable(id);
        log.info("dto={}. ", dto);
    }
}
