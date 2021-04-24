package top.ss007.builder.traditionversion;

/**
 * Created by Ben.Wang on 2019/1/24.
 */
public class LenovoComputerBuilder extends ComputerBuilder {

    private Computer computer;

    public LenovoComputerBuilder(String cpu, String ram) {
        computer=new Computer(cpu,ram);
    }


    @Override
    public void setUsbCount() {
        computer.setUsbCount(4);
    }

    @Override
    public void setKeyboard() {
        computer.setKeyboard("联想键盘");
    }

    @Override
    public void setDisplay() {
        computer.setDisplay("联想显示器");
    }

    @Override
    public Computer getComputer() {
        return computer;
    }
}
