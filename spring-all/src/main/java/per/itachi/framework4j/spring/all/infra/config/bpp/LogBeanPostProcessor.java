package per.itachi.framework4j.spring.all.infra.config.bpp;

import javax.annotation.PostConstruct;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogBeanPostProcessor implements BeanPostProcessor {

    @PostConstruct // will execute.
    public void init() {
        log.info("LogBeanPostProcessor initialized. ");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName)
            throws BeansException {
        log.info("postProcessBeforeInitialization: beanName={}, bean={}. ", beanName, bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName)
            throws BeansException {
        log.info("postProcessAfterInitialization: beanName={}, bean={}. ", beanName, bean);
        return bean;
    }
}
