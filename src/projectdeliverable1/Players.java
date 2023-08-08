package projectdeliverable1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Players {
    private String name;
    private ArrayList<Cards> hand;
    private int score;

    public Players(String name) {
        this.name = name;
        hand = new ArrayList<>();
        score = 0;
    }

    public String getName() {
        return name;
    }

    public int getHandSize() {
        return hand.size();
    }

    public void addCard(Cards card) {
        hand.add(card);
    }

    public Cards playCard(int index) {
        return hand.remove(index);
    }
 
    public String getHandAsString() {
    StringBuilder sb = new StringBuilder("Your Hand: ");
    for (Cards card : hand) {
        sb.append(card.toString()).append(" ");
    }
    return sb.toString();
}


    public void play(Cards discardPile, Deck1 deck) {
        System.out.println("Your hand:");
        for (int i = 0; i < hand.size(); i++) {
            System.out.println(i + ": " + hand.get(i));
        }
        boolean played = false;
        while (!played) {
            System.out.println("Enter index of the card you want to play or type 'draw' to draw a card:");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if (input.equalsIgnoreCase("draw")) {
                Cards newCard = deck.drawCards();
                System.out.println("You drew " + newCard);
                if (newCard.getColor().equals(discardPile.getColor()) || newCard.getValue() == discardPile.getValue()) {
                    System.out.println("You can play your new card!");
                    hand.add(newCard);
                    played = true;
                } else {
                    System.out.println("You cannot play your new card.");
                }
            } else {
                int index = Integer.parseInt(input);
                Cards card = hand.get(index);
                if (card.getColor().equals(discardPile.getColor()) || card.getValue() == discardPile.getValue()) {
                    discardPile = card;
                    hand.remove(index);
                    System.out.println("You played " + card);
                    played = true;
                    updateScore(card);
                } else {
                    System.out.println("You cannot play " + card);
                }
            }
        }
    }

    private void updateScore(Cards card) {
        score += card.getValue();
        if (card.getValue() == 11) {
            UnoGame unoGame = new UnoGame();
List<Players> players = unoGame.getPlayers();
for (Players player : players) {


                if (!player.equals(this)) {
                    player.updateScore(11);
                }
            }
        }
    }

    private void updateScore(int value) {
        score += value;
    }

    public int getScore() {
        return score;
    }
    public List<Cards> getHand() {
    return hand;
}
}
