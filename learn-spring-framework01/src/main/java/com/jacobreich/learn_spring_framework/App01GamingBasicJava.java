package com.jacobreich.learn_spring_framework;

import com.jacobreich.game.GameRunner;
import com.jacobreich.game.PacManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//var game = new MarioGame();
		//var game = new SuperContraGame();
		var game = new PacManGame();
		var gameRunner = new GameRunner(game);
		
		gameRunner.run();
	}

}
