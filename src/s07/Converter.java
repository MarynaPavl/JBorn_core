package s07;

public interface Converter<T, U> {
    U conversion (T obj);
}
