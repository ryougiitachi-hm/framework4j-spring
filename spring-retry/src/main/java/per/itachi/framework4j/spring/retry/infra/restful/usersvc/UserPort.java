package per.itachi.framework4j.spring.retry.infra.restful.usersvc;

import per.itachi.framework4j.spring.retry.infra.restful.usersvc.dto.UserDTO;

public interface UserPort {

    void addUser();

    UserDTO getUserById(Long id);

    UserDTO getUserByIdRetryable(Long id);
}
