package per.itachi.framework4j.spring.boot.starter.app.service.impl;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import per.itachi.framework4j.spring.boot.starter.app.service.StarterService;

@Slf4j
public class StarterServiceImpl implements StarterService {

    @PostConstruct
    public void init() {
        log.info("initialized ");
    }

    @Override
    public void test() {
    }
}
