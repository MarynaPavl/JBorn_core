package s13;

import java.util.List;

public class ObjectToSend {
    @Min(length = 13)
    @Max(length = 40)
    private int length;

    @Regexp(regexp = "^[A-Za-z]+")
    @NotNull()
    private String name;

    @NotEmpty()
    private List<String> number;


    public ObjectToSend(int length, String name, List<String> number) {
        this.length = length;
        this.name = name;
        this.number = number;
    }

    public double getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getNumber() {
        return number;
    }

    public void setNumber(List<String> number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "ObjectToSend{" +
                "length=" + length +
                ", name='" + name + '\'' +
                '}';
    }
}
