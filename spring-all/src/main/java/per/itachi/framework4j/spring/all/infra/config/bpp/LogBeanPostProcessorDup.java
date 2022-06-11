package per.itachi.framework4j.spring.all.infra.config.bpp;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class LogBeanPostProcessorDup implements BeanPostProcessor {

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
