package s06;

public class LowerCaseHendler implements Handler {
    private String message;

    @Override
    public String handleMessage(String message) {
        this.message = message;
        return message;
    }

    String lower() {
        return message.toLowerCase();
    }

}
