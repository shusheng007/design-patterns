package top.ss007.builder.traditionversion;

/**
 * Created by Ben.Wang on 2019/1/24.
 */
public class MacComputerBuilder extends ComputerBuilder {

    private Computer computer;

    public MacComputerBuilder(String cpu, String ram) {
        computer = new Computer(cpu, ram);
    }


    @Override
    public void setUsbCount() {
        computer.setUsbCount(2);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("苹果键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("苹果显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
