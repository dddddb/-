package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.MathOperation;

import java.util.Optional;

public class test {

    static MathFactoryInterface getFactory(String operator){
        MathFactoryInterface result = null;
        if("add".equals(operator)){
            result = new AddFactory();
        }else if("sub".equals(operator)){
            result = new SubFactory();
        }else if("multiply".equals(operator)){
            result = new MultiplyFactory();
        }else if("divide".equals(operator)){
            result = new DivideFactory();
        }
        return Optional.ofNullable(result).orElseThrow(() -> new IllegalArgumentException("未知的操作"));
    }
    public static void main(String[] args) {
        MathFactoryInterface factory = getFactory("add");
        MathOperation operation = factory.getOperation().orElseThrow(() ->
                new IllegalArgumentException("未知的操作"));
        double result = operation.apply(2,2);
        System.out.println(result);

    }
}
