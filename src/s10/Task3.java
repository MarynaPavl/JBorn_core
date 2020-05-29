package s10;

public class Task3 {
    public static void main(String[] args) {
        RealizationQueue<String> realiz = new RealizationQueue<>();
        realiz.add("Hello,");
        realiz.add("who");
        realiz.add("is");
        realiz.add("the");
        realiz.add("first?");

        for (int i = 0; i < realiz.size(); i++) {
            System.out.print(realiz.get(i) + " ");
        }
        System.out.println("\n" + realiz.poll());


        for (int i = 0; i < realiz.size(); i++) {
            System.out.print(realiz.get(i) + " ");
        }
        System.out.println("\n" + realiz.peek());
    }
}
