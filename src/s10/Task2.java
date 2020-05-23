package s10;

public class Task2 {
    public static void main(String[] args) {
        MyNewList<Integer> myNewList = new MyNewList<>();
        myNewList.add(15);
        myNewList.add(8);
        myNewList.add(12);
        myNewList.add(3);
        myNewList.add(8);
        myNewList.add(9);


        System.out.println(myNewList.get(2));

        myNewList.put(10);
        for (int i = 0; i < myNewList.size; i++) {
            System.out.print(myNewList.get(i) + " ");
        }
        System.out.println();

        myNewList.put(3, 100);
        for (int i = 0; i < myNewList.size; i++) {
            System.out.print(myNewList.get(i) + " ");
        }
        System.out.println();

        myNewList.remove(2);
        for (int i = 0; i < myNewList.size; i++) {
            System.out.print(myNewList.get(i) + " ");
        }
        System.out.println();

        myNewList.remove(Integer.valueOf(4));
        for (int i = 0; i < myNewList.size; i++) {
            System.out.print(myNewList.get(i) + " ");
        }
        System.out.println();

        System.out.println(myNewList.length());

    }
}
