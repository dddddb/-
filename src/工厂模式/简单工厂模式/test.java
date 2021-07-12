package 工厂模式.简单工厂模式;

import java.util.Optional;

public class test {
    public static void main(String[] args) {
        MathOperation operation =MatchFactory.getOperation("multiply").orElseThrow(() ->
                new IllegalArgumentException("未知的操作"));
        double result = operation.apply(2, 2);
        System.out.println(result);
    }
}
