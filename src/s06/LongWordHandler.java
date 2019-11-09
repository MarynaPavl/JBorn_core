package s06;

public class LongWordHandler implements Handler {
    private int m;
    private int n;

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

    @Override
    public String handleMessage(String message) {
        int i = 0;
        if (message == null)
            return null;
        String[] letters = message.split(" ");

        for (String str1 : letters) {
            if (str1.length() >= getN()) {
                i++;
            }
        }
        if (i >= getM()) {
            return message;
        } else
            return null;
    }
}

