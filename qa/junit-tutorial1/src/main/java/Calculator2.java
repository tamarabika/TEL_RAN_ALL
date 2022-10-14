import java.util.function.DoubleBinaryOperator;
import java.util.stream.DoubleStream;
public class Calculator2 {

    int sum(int first,int second){
        return first + second;
    }
    int subtract(int first, int second){
        return first - second;
    }
    int multiply(int first, int second){
        return first * second;
    }
    int divide(int first, int second){
        if (second == 0) {
            throw new IllegalArgumentException("Cannot divide by 0");
        }
        return first / second;
    }
}
