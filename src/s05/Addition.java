package s05;

public class Addition extends Operation {

    @Override
     int calculate(int leftOperand, int rightOperand) {
        this.previous = this.current;
        this.current = leftOperand + rightOperand;
        return this.current;
    }

}
