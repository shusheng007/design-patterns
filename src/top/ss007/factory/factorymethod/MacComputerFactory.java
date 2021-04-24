package top.ss007.factory.factorymethod;


import top.ss007.factory.Computer;
import top.ss007.factory.MacComputer;

/**
 * Created by Ben.Wang on 2019/1/25.
 *
 */
public class MacComputerFactory implements ComputerFactory {
    @Override
    public Computer makeComputer() {
        return new MacComputer();
    }
}
