package s13;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    boolean validate(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Max.class)) {
                BigDecimal a = BigDecimal.valueOf(field.getAnnotation(Max.class).length());
                if (field.getType() == String.class) {
                    BigDecimal b = new BigDecimal((String) field.get(obj));
                    if (b.compareTo(a) >= 0) {
                        return false;
                    }
                } else {

                    BigDecimal b = new BigDecimal(String.valueOf(field.get(obj)));
                    if (b.compareTo(a) >= 0) {

                        return false;
                    }
                }
            }
            if (field.isAnnotationPresent(Min.class)) {
                BigDecimal a = BigDecimal.valueOf(field.getAnnotation(Min.class).length());
                if (field.getType() == String.class) {
                    BigDecimal b = new BigDecimal((String) field.get(obj));
                    if (b.compareTo(a) <= 0) {
                        return false;
                    }
                } else {
                    BigDecimal b = new BigDecimal(String.valueOf(field.get(obj)));
                    if (b.compareTo(a) <= 0) {
                        return false;
                    }
                }
            }
            if (field.isAnnotationPresent(NotNull.class)) {
                if (field.get(obj) == null) {
                    return false;
                }
            }
            if (field.isAnnotationPresent(Regexp.class)) {
                if(field.get(obj) instanceof CharSequence) {
                    Pattern p = Pattern.compile(field.getAnnotation(Regexp.class).regexp());
                    Matcher m = p.matcher((CharSequence) field.get(obj));
                    if (!m.matches()) {
                        return false;
                    }
                }
            }
            if (field.isAnnotationPresent(NotEmpty.class)) {
                NotEmpty notEmpty = field.getDeclaredAnnotation(NotEmpty.class);
                if (notEmpty != null) {
                    if ((field.get(obj) instanceof Collection) && ((Collection) field.get(obj)).isEmpty()) {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
