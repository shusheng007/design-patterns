package top.ss007.command;

import java.util.ArrayList;
import java.util.List;


/**
 * 调用者，其只认识Command接口，而不认识具体的实现。
 * 其负责按照客户端的指令设置并执行命令，像命令的撤销，日志的记录等功能都要在此类中完成
 */
public class RobotInvoker {
    private final List<Command> sexRobotCommands = new ArrayList<>();

    public void clearCommand(){
        sexRobotCommands.clear();
    }

    //设置一套命令，不知道具体执行者是谁
    public void addCommands(Command command) {
        sexRobotCommands.add(command);
    }

    //执行脱衣系列命令
    public void executeCommand() {
        for (Command tuoYiCommand : sexRobotCommands) {
            tuoYiCommand.execute();
        }
    }
}
