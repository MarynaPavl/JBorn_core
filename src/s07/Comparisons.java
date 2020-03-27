package s07;

public class Comparisons {

    public <T extends Number> int comparison(T a, T b) {
        if (a instanceof Double & b instanceof Double) {
            return ((Double) a).compareTo((Double) b);
        } else {
            if (a instanceof Double) {
                Double l = (Double) a;
                Double num = b.doubleValue();
                return l.compareTo(num);
            }
            if (b instanceof Double) {
                Double l = (Double) b;
                Double num = a.doubleValue();
                return num.compareTo(l);
            } else {
                Double l = a.doubleValue();
                Double num = b.doubleValue();
                return l.compareTo(num);
            }

        }

    }
}