package 工厂模式.工厂方法模式;

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
        return result;
    }
    public static void main(String[] args) {
        MathFactoryInterface factory = getFactory("add");

        double result = factory.getOperation().apply(2,2);
        System.out.println(result);

    }
}
