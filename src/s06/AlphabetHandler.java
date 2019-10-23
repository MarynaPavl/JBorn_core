package s06;

public class AlphabetHandler implements Handler {
    private String message;

    @Override
    public String handleMessage(String message) {
        this.message = message;

        return message;
    }

    String alphabet() {
        String s = message;
        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);
            if (Character.isLetter(c) || Character.isSpaceChar(c)) {
                s = message;
            } else

                s = null;
        }
        return s;
    }
}



