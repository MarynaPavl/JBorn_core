package s06;

import java.util.Locale;

public class LowerCaseHandler implements Handler {

    @Override
    public String handleMessage(String message) {
        message = message.trim();
        return message.toLowerCase();
    }
}
