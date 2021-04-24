package top.ss007.builder.traditionversion;

/**
 * Created by Ben.Wang on 2019/1/24.
 */
public abstract class ComputerBuilder {
    public abstract void setUsbCount();
    public abstract void setKeyboard();
    public abstract void setDisplay();

    public abstract Computer getComputer();
}
