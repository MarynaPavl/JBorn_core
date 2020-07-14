package s13;

import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
    boolean validate(Object obj) throws IllegalAccessException {
        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(Max.class) & field.isAnnotationPresent(Min.class)) {
                Integer a = field.getAnnotation(Max.class).length();
                Integer c = field.getAnnotation(Min.class).length();
                if (field.getType() == String.class) {
                    Integer b = Integer.valueOf((String) field.get(obj));
                    if (b.compareTo(a) >= 0 | b.compareTo(c) <= 0) {
                        return false;
                    }
                }
                Integer b = (Integer) field.get(obj);
                if (b.compareTo(a) >= 0 | b.compareTo(c) <= 0) {

                    return false;
                }
            }
            if (field.isAnnotationPresent(NotNull.class)) {
                if (field.get(obj) == null) {
                    return false;
                }
            }
            if (field.isAnnotationPresent(Regexp.class)) {
                Pattern p = Pattern.compile(field.getAnnotation(Regexp.class).regexp());
                Matcher m = p.matcher((CharSequence) field.get(obj));
                if (!m.matches()) {
                    return false;
                }
            }
            if (field.isAnnotationPresent(NotEmpty.class)) {
                NotEmpty notEmpty = field.getDeclaredAnnotation(NotEmpty.class);
                if (notEmpty != null) {
                    Object aClass = field.get(obj);
                    if ((aClass instanceof Collection) && ((Collection) aClass).isEmpty()) {
                        return false;
                    }
                }
            }

        }
        return true;
    }
}
