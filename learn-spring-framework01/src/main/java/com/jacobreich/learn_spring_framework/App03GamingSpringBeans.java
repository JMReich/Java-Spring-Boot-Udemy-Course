package com.jacobreich.learn_spring_framework;

import com.jacobreich.game.GameRunner;
import com.jacobreich.game.GamingConsole;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App03GamingSpringBeans {

	public static void main(String[] args) {

		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
			System.out.println(context.getBean(GamingConsole.class));
			context.getBean(GamingConsole.class).up();

			context.getBean(GameRunner.class).run();

		};



		//var game = new MarioGame();
		//var game = new SuperContraGame();
		//var game = new PacManGame();
		//var gameRunner = new GameRunner(game);
		
		//gameRunner.run();
	}

}
