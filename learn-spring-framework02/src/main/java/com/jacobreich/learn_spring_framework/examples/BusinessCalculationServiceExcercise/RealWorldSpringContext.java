package com.jacobreich.learn_spring_framework.examples.BusinessCalculationServiceExcercise;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class RealWorldSpringContext {

    public static void main(String[] args) {
        try (var context = new AnnotationConfigApplicationContext(RealWorldSpringContext.class)) {

            Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

            System.out.println(context.getBean(BusinessCalculationService.class).findMax());

        };
    }
}
