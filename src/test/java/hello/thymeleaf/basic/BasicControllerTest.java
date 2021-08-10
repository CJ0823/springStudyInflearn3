package hello.thymeleaf.basic;

import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

class BasicControllerTest {

    @Autowired
    private BasicController basicController;

    private final Logger log = LoggerFactory.getLogger(getClass());

    @Test
    @DisplayName("빈 이름 조회 테스트")
    void BeanFind() {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(BasicController.class);
        String[] beanDefinitionNames = ac.getBeanDefinitionNames();
        for (String beanDefinitionName : beanDefinitionNames) {
            log.info(beanDefinitionName);
        }
    }
}