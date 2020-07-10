package s13;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) throws IllegalAccessException {
        ObjectToSend object = new ObjectToSend(28, "Tom", new ArrayList<>());
        List<ObjectToSend> number = new ArrayList<>();
        number.add(object);

        Validator valid = new Validator();
        System.out.println(valid.validate(object, number));
    }
}
