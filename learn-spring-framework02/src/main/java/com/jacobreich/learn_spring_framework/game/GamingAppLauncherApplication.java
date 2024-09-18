package com.jacobreich.learn_spring_framework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan("com.jacobreich.game")
public class GamingAppLauncherApplication {
	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncherApplication.class)) {
			System.out.println(context.getBean(GamingConsole.class));
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();

		};
	}

}
