package com.example.rock.config;

import com.example.rock.model.Game;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class GameConfig {
    @Bean
    public Game gameBean() {
        return new Game();
    }

}
