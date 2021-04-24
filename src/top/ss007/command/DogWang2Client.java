package top.ss007.command;

/**
 * 客户端，客户端负责构建命令并使用Invoker执行
 */
public class DogWang2Client {

    //享受xa机器人的服务
    public void enjoySexRobot() {
        //robot 控制系统，用户通过此系统来发出命令
        RobotInvoker invoker = new RobotInvoker();

        //生成脱衣命令
        FanBingBingReceiver bingBingReceiver = new FanBingBingReceiver();
        TuoXiongZhaoCommand tuoXiongZhaoCommand = new TuoXiongZhaoCommand(bingBingReceiver);
        TuoKuZiCommand tuoKuZiCommand = new TuoKuZiCommand(bingBingReceiver);
        //构建执行计划
        invoker.addCommands(tuoXiongZhaoCommand);
        invoker.addCommands(tuoKuZiCommand);

        //生成跳舞命令
        YangMiReceiver yangMiReceiver = new YangMiReceiver();
        TiaoLaWuCommand tiaoLaWuCommand = new TiaoLaWuCommand(yangMiReceiver, "半小时");
        //构建执行计划
        invoker.addCommands(tiaoLaWuCommand);

        //执行命令
        invoker.executeCommand();
    }
}
