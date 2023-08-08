package projectdeliverable1;

import java.util.ArrayList;
import java.util.Collections;

public class Deck1 {
    private ArrayList<Cards> cards;

    public Deck1() {
        cards = new ArrayList<>();
        String[] colors = { "red", "yellow", "green", "blue" };
        int[] values = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        for (String color : colors) {
            for (int value : values) {
                cards.add(new Cards(color, value));
                if (value != 0) {
                    cards.add(new Cards(color, value));
                }
            }
        }
        Collections.shuffle(cards);
    }
    public boolean hasCards(Cards card) {
    return cards.contains(card);
}

  public Cards drawCards() {
        if (cards.size() == 0) {
            return null;
        }
        return cards.remove(0);
    }

    public int getCardSize() {
        
        return cards.size();
    }
}
