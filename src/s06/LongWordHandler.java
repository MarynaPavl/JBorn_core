package s06;

public class LongWordHandler implements Handler {
    private String message;
    private int m;
    private int n;

    @Override
    public String handleMessage(String message) {
        this.message = message;
        return message;
    }

    LongWordHandler(int m, int n) {
        this.m = m;
        this.n = n;
    }

    private int getM() {
        return m;
    }

    public int getN() {
        return n;
    }

    String longWord() {
        int i = 0;
        String[] letters = message.split(" ");

        for (String str1 : letters) {
            if (str1.length() == getN()) {
                i++;
            }
        }
        if (i == getM()) {
            return message;
        } else {
            return null;
        }

    }
}
