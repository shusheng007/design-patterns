package top.ss007.command;

public class SingSongCommand implements Command {
    private BingBingReceiver bingBing;

    public SingSongCommand(BingBingReceiver bingBing) {
        this.bingBing = bingBing;
    }

    @Override
    public void execute() {
        bingBing.singSong();
    }
}
