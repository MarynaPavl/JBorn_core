package s16;


@FunctionalInterface
public interface Validator<T> {
    boolean isValid(T obj);
}
