package projectdeliverable1;

/**
 * @author Kirandeep Kaur
 */
public class Cards {
    private String Cardcolor;
    private int value;

    public Cards(String color, int value) {
        this.Cardcolor = color;
        this.value = value;
    }
      

public boolean matches(Cards other) {
    return this.getColor().equals(other.getColor()) || this.getValue() == other.getValue();
}


    public String getColor() {
        return Cardcolor;
    }

    public int getValue() {
        return value;
    }


    @Override
    public String toString() {
        return Cardcolor + " " + value;
    }
}
