package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.AddOperation;
import 工厂模式.简单工厂模式.MathOperation;

import java.util.Optional;

public class AddFactory implements MathFactoryInterface{
    @Override
    public Optional<MathOperation> getOperation() {
        return Optional.of(new AddOperation());
    }
}
