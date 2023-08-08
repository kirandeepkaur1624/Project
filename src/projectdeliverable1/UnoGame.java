/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projectdeliverable1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author Kirandeep Kaur
 */

public class UnoGame {
private List<Players> players;
private Deck1 deck;
private Cards discardPile;
private boolean gameEnd;

public UnoGame() {
    players = new ArrayList<>();
    deck = new Deck1();
    discardPile = deck.drawCards();
    gameEnd = false;
}

public boolean isGameEnd() {
    return gameEnd;
}

public boolean hasPlayer(Players player) {
    return players.contains(player);
}

public boolean canPlay(Players player) {
    for (Cards card : player.getHand()) {
        if (card.matches(discardPile)) {
            return true;
        }
    }
    return false;
}

public void addPlayer(Players player) {
    players.add(player);
}

public void startGame() {
    while (!gameEnd) {
        for (Players player : players) {
            if (gameEnd) {
                break;
            }
            System.out.println(player.getName() + ", it's your turn.");
            System.out.println("The card on the discard pile is " + discardPile);
            player.play(discardPile, deck);
            if (player.getHandSize() == 0) {
                System.out.println(player.getName() + " wins!");
                gameEnd = true;
                break;
            }
        }
    }
    showScores();
}

private void showScores() {
    System.out.println("Final Scores:");
    for (Players player : players) {
        System.out.println(player.getName() + ": " + player.getScore());
    }
}

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    boolean playAgain = true;
    while (playAgain) {
        UnoGame game = new UnoGame();

        System.out.println("Enter the number of players:");
        int numPlayers = scanner.nextInt();

        for (int i = 1; i <= numPlayers; i++) {
            System.out.println("Enter the name of player " + i + ":");
            String name = scanner.next();
            game.addPlayer(new Players(name));
        }

        game.startGame();

        System.out.println("Do you want to play again? (y/n)");
        String input = scanner.next();
        playAgain = input.equalsIgnoreCase("y");
    }
}

public List<Players> getPlayer() {
    return players;
}

public void play() {
    throw new UnsupportedOperationException("Not supported yet.");
}

    List<Players> getPlayers() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}




