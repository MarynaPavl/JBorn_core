package s10;

public class Task1 {
    public static void main(String[] args) {
        MyList<Integer> loopList = new MyList<>();
        loopList.add(5);
        loopList.add(8);
        loopList.add(9);
        loopList.add(12);

        System.out.println(loopList.isCyclicity(loopList.first));

    }
}
