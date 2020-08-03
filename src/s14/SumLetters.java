package s14;

import java.util.Comparator;

public class SumLetters implements Runnable {
    private final char[] array;
    private final char aChar;
    private long result = 0;

    public SumLetters(char[] array, char aChar) {
        this.array = array;
        this.aChar = aChar;
    }

    @Override
    public void run() {
        for (char c : array) {
            if (c == aChar) {
                result++;
            }
        }
    }

    public char getaChar() {
        return aChar;
    }

    public long getResult() {
        return result;
    }

}
class LettersComparator implements Comparator<SumLetters> {

    @Override
    public int compare(SumLetters o1, SumLetters o2) {
        int compare = Long.compare(o2.getResult(), o1.getResult());
        if (compare != 0) {
            return compare;
        }
        return Character.compare(o1.getaChar(), o2.getaChar());
    }
}
