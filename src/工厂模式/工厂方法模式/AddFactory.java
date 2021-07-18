package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.AddOperation;
import 工厂模式.简单工厂模式.MathOperation;

public class AddFactory implements MathFactoryInterface{
    @Override
    public MathOperation getOperation() {
        return new AddOperation();
    }
}
