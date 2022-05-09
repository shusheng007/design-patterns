package top.ss007.command;

public class PlayPianoCommand implements Command {
    private BingBingReceiver bingBing;

    public PlayPianoCommand(BingBingReceiver bingBing) {
        this.bingBing = bingBing;
    }

    @Override
    public void execute() {
        bingBing.playPiano();
    }
}
