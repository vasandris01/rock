package com.example.rock.service;

import com.example.rock.model.Game;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class GameService {
    private Game game;

    public GameService(Game game) {
        this.game = game;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }

    public void useInput(String choice) {
        game.setComputerChoice(computerChoice());
        game.setPlayerChoice(choice);
        game.setWhoWin(whoWin(game.getComputerChoice(),game.getPlayerChoice()));
    }

    private String whoWin(String computer, String player){
        if(computer.equals(player)){
            return "draw";
        }
        if(computer.equals("rock") && player.equals("paper") ||
        computer.equals("paper") && player.equals("scissors") ||
        computer.equals("scissors") && player.equals("rock")){
            return "player win";
        }
        return "computer win";
    }
    private String computerChoice() {
        switch (new Random().nextInt(3)) {
            case 0 -> {
                return "rock";
            }
            case 1 -> {
                return "paper";
            }
            default -> {
                return "scissors";
            }
        }
    }
}
