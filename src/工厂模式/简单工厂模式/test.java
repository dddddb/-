package 工厂模式.简单工厂模式;

public class test {
    public static void main(String[] args) {
        MathOperation operation = MatchFactory.getOperation("multiply");
        double result = operation.apply(2, 2);
        System.out.println(result);
    }
}
