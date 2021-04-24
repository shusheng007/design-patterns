package top.ss007.builder;


import top.ss007.builder.simple.PersonalComputer;
import top.ss007.builder.traditionversion.*;

public class BuilderPatternService {


    public void assemblePcUseSimpleBuilder() {
        PersonalComputer computer = new PersonalComputer.Builder("I5处理器", "三星125")
                .setDisplay("苹果显示器")
                .setKeyboard("苹果键盘")
                .setUsbCount(2)
                .build();
        System.out.println("assembled personal computer:" + computer.toString());
    }

    public void assemblePcUseTraditionBuilder() {
        //指导创建步骤
        ComputerDirector director = new ComputerDirector();

        ComputerBuilder builder = new MacComputerBuilder("I5处理器", "三星125");
        director.makeComputer(builder);
        Computer macComputer = builder.getComputer();
        System.out.println("mac computer:" + macComputer.toString());

        ComputerBuilder lenovoBuilder = new LenovoComputerBuilder("I7处理器", "海力士222");
        director.makeComputer(lenovoBuilder);
        Computer lenovoComputer = lenovoBuilder.getComputer();
        System.out.println("lenovo computer:" + lenovoComputer.toString());
    }

}
