package s06;

import java.util.Locale;

public class LowerCaseHandler implements Handler {

    @Override
    public String handleMessage(String message) {
        if (message == null)
            return null;
        message = message.trim();
        return message.toLowerCase();
    }
}
