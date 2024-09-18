package com.jacobreich.learn_spring_framework.examples.d1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
class ClassA {

}


/*
The @Lazy tag will only load the bean if it is
being used instead of during the initialization
of the context.

NOT recommended and rarely used.
 */



@Component
@Lazy
class ClassB {
	private  ClassA classA;

	public ClassB(ClassA classA) {
		// Logic
		System.out.println("Some initialization logic");
		this.classA = classA;
	}

	public void doSomething() {
		System.out.println("Did something");
	}
}





@Configuration
@ComponentScan
public class LazyInitializationLauncherApplication {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(LazyInitializationLauncherApplication.class)) {
			// Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);

			System.out.println("Initialization of context is complete.");

			context.getBean(ClassB.class).doSomething();

		};
	}

}
