package s05;

public class Multiplication extends Operation {
    @Override
    int calculate(int leftOperand, int rightOperand) {
        this.previous = current;
        this.current = leftOperand * rightOperand;
        return this.current;
    }

}