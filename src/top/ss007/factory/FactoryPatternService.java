package top.ss007.factory;


import top.ss007.factory.abstractfactory.AbstractFactory;
import top.ss007.factory.abstractfactory.AppleFactory;
import top.ss007.factory.factorymethod.ComputerFactory;
import top.ss007.factory.factorymethod.MacComputerFactory;
import top.ss007.factory.simplefactory.SimpleComputerFactory;

public class FactoryPatternService {

    public void makePcUseSimpleFactory() {
        Computer computer = SimpleComputerFactory.makeComputer("mi");
        computer.setOperationSystem();
    }

    public void makePcUseFactory(){
        //需要创建哪个品牌的电脑就使用对应的工厂，此处想生产Mac,所以使用了MacComputerFactory
        ComputerFactory factory = new MacComputerFactory();
        factory.makeComputer().setOperationSystem();
    }

    public void makePcUseAbstractFactory(){
        AbstractFactory appleFactory = new AppleFactory();
        appleFactory.makeComputer().setOperationSystem();
        appleFactory.makeMobilePhone().setOperationSystem();
    }

}
