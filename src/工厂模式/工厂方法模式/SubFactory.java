package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.MathOperation;
import 工厂模式.简单工厂模式.SubOperation;

public class SubFactory implements MathFactoryInterface{
    @Override
    public MathOperation getOperation() {
        return new SubOperation();
    }
}
