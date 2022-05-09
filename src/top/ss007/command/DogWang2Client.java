package top.ss007.command;

/**
 * 客户端，客户端负责构建命令并使用Invoker执行
 */
public class DogWang2Client {

    //享受陪伴机器人的服务
    public void enjoySexRobot() {
        //robot 控制系统，用户通过此系统来发出命令
        RobotInvoker invoker = new RobotInvoker();

        //生成唱歌弹琴命令
        BingBingReceiver bingBingReceiver = new BingBingReceiver();
        SingSongCommand singSongCommand = new SingSongCommand(bingBingReceiver);
        PlayPianoCommand playPianoCommand = new PlayPianoCommand(bingBingReceiver);
        //构建执行计划
        invoker.addCommands(singSongCommand);
        invoker.addCommands(playPianoCommand);
        //执行命令
        invoker.executeCommand();

        //生成跳舞命令
        MiMiReceiver miMiReceiver = new MiMiReceiver();
        TiaoLaWuCommand tiaoLaWuCommand = new TiaoLaWuCommand(miMiReceiver, "半小时");
        //构建执行计划
        invoker.clearCommand();
        invoker.addCommands(tiaoLaWuCommand);

        //执行命令
        invoker.executeCommand();
    }
}
