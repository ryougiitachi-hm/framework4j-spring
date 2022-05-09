package per.itachi.framework4j.spring.cloud.openfeign.infra.restful.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;

@Getter
@Setter
@ToString
public class CustomerResponse {

    private String name;

    private String idCard;

    private LocalDate birthday;

    private String customerNbr;
}
