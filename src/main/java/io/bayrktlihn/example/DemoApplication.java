package io.bayrktlihn.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.servlet.HandlerExceptionResolver;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplication.class, args);

        for (String beanDefinitionName : run.getBeanDefinitionNames()) {
            Object bean = run.getBean(beanDefinitionName);
            if (bean instanceof HandlerExceptionResolver) {
                System.out.println("dur");
            }
        }
    }

    @Override
    public void run(String... args) throws Exception {
    }
}
