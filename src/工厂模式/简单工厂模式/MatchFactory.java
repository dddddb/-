package 工厂模式.简单工厂模式;

public class MatchFactory {
    public static MathOperation getOperation(String operator) {
        MathOperation result = null;
        if("add".equals(operator)){
            result = new AddOperation();
        }else if("sub".equals(operator)){
            result = new SubOperation();
        }else if("multiply".equals(operator)){
            result = new MultiplyOperation();
        }else if("divide".equals(operator)){
            result = new DivideOperation();
        }
        return result;
    }

}
