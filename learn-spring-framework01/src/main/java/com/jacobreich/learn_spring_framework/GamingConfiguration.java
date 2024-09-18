package com.jacobreich.learn_spring_framework;


import com.jacobreich.game.GameRunner;
import com.jacobreich.game.GamingConsole;
import com.jacobreich.game.MarioGame;
import com.jacobreich.game.PacManGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {

    @Bean
    public GamingConsole game() {
        var game = new PacManGame();
        return game;
    }

    /*
    @Bean
    public GamingConsole game2() {
        var game = new MarioGame();
        return game;
    }
    */


    @Bean
    public GameRunner gameRunner(GamingConsole game) {
        var gameRunner = new GameRunner(game);
        return gameRunner;
    }

}
