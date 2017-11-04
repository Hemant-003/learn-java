package com.hemant;

public class Main {

    public static void main(String[] args) {
        String inputBoard = "E,E,J,H,E,T,J,T,E,E,H,J,T,H,E,E,J,H,E,T,J,T,E,E,H,J,T,H,J,E,E,J,H,E,T,J,T,E,E,H,J,T,E,H,E";
        int numberOfPlayers = 3;
        Game game = new Game(3, inputBoard);
        game.play();
        game.result();
    }
}
