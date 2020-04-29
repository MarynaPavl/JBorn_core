package s09;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        User user = new User("Сергей", "Сергеев");
        System.out.println(user.getFirstname() + " " + user.getLastname());


        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Test"));
             ObjectInputStream in = new ObjectInputStream(new FileInputStream("Test"))) {

            out.writeObject(user);

            user = (User) in.readObject();

            System.out.println(user.getFirstname() + " " + user.getLastname());


        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
