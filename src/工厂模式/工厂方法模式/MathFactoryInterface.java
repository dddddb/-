package 工厂模式.工厂方法模式;

import 工厂模式.简单工厂模式.MathOperation;

import java.util.Optional;

public interface MathFactoryInterface {
    Optional<MathOperation> getOperation();
}
