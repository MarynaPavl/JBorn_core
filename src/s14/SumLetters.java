package s14;

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
