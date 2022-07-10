package per.itachi.framework4j.spring.retry.infra.restful.usersvc.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class UserDTO {

    private Long id;

    private String username;

    private LocalDate birthday;
}
