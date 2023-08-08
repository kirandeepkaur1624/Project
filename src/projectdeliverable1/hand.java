package projectdeliverable1;

/**
 * Game class manages the overall flow of the UNO game
 */
import java.util.ArrayList;
import java.util.List;

public class hand {
    private List<Cards> cards;
    private List<Cards> card;

    public hand() {
        cards = new ArrayList<>();
    }

    public void addCard(Cards card) {
        cards.add(card);
    }

    public void removeCard(Cards card) {
        cards.remove(card);
    }

    public int getHandSize() {
        return cards.size();
    }

    public List<Cards> getCards() {
        return card;
    }

    public Cards getCard(int index) {
        return cards.get(index);
    }

    public boolean hasCard(Cards card) {
        return cards.contains(card);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Cards card : cards) {
            sb.append(card.toString()).append(", ");
        }
        if (sb.length() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }
}
