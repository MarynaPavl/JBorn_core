package s13;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) throws IllegalAccessException {
        ObjectToSend object = new ObjectToSend(28, "Tom", new ArrayList<>());
        Validator valid = new Validator();
        System.out.println(valid.validate(object));
    }
}
