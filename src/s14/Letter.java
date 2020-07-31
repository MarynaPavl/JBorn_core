package s14;

import java.util.Comparator;

public class Letter {
    char letter;
    long quantity;

    public Letter(char letter, long quantity) {
        this.letter = letter;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Letter{" +
                "letter='" + letter + "\'" +
                " quantity=" + quantity +
                '}';
    }
}

class LettersComparator implements Comparator<Letter> {

    @Override
    public int compare(Letter o1, Letter o2) {
        int compare = Long.compare(o2.quantity, o1.quantity);
        if (compare != 0) {
            return compare;
        }
        return Character.compare(o1.letter, o2.letter);
    }
}
