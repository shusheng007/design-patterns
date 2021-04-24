package top.ss007.factory.abstractfactory;


import top.ss007.factory.Computer;
import top.ss007.factory.MiComputer;

/**
 * Created by Ben.Wang on 2019/1/25.
 */
public class XiaoMiFactory implements AbstractFactory {
    @Override
    public Computer makeComputer() {
        return new MiComputer();
    }

    @Override
    public MobilePhoto makeMobilePhoto() {
        return new MiPhoto();
    }
}
