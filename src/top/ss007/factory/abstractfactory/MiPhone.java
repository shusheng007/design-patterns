package top.ss007.factory.abstractfactory;

/**
 * Created by Ben.Wang on 2019/1/25.
 */
public class MiPhone extends MobilePhone {
    @Override
    public void setOperationSystem() {
        System.out.println("小米手机安装Android系统");
    }
}
