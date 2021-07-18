package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.DivideOperation;
import 工厂模式.简单工厂模式.MathOperation;

public class DivideFactory implements MathFactoryInterface{
    @Override
    public MathOperation getOperation() {
        return new DivideOperation();
    }
}
