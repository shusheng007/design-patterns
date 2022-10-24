package top.ss007.factory.abstractfactory;


import top.ss007.factory.Computer;
import top.ss007.factory.MacComputer;

/**
 * Created by Ben.Wang on 2019/1/25.
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Computer makeComputer() {
        return new MacComputer();
    }

    @Override
    public MobilePhone makeMobilePhone() {
        return new IPhone();
    }
}
