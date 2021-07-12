package 工厂模式.简单工厂模式;

public class DivideOperation implements MathOperation {
    @Override
    public double apply(int a, int b) {
        return (double) a / b;
    }
}
