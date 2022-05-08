package per.itachi.framework4j.spring.cloud.consumer.app.dto;

import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CustomerDto {

    private String name;

    private String idCard;

    private LocalDate birthday;

    private String customerNbr;
}
