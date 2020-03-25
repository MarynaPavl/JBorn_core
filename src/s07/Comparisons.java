package s07;

public class Comparisons {

    public <T extends Number> int comparison(T a, T b) {
        if (a instanceof Double & b instanceof Double) {
            return ((Double) a).compareTo((Double) b);
        } else {
            if (a instanceof Double) {
                Double d1 = (Double) a;
                Long l = Math.round(d1);
                String st = String.valueOf(b);
                Long num = Long.valueOf(st);
                return l.compareTo(num);
            }
            if (b instanceof Double) {
                Double d1 = (Double) b;
                Long l = Math.round(d1);
                String st = String.valueOf(a);
                Long num = Long.valueOf(st);
                return num.compareTo(l);
            } else {
                String s = String.valueOf(a);
                String st = String.valueOf(b);
                Long num1 = Long.valueOf(s);
                Long num2 = Long.valueOf(st);
                return num1.compareTo(num2);
            }

        }

    }
}