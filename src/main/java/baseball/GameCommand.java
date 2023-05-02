package baseball;

public enum GameCommand {
    RESTART(1),
    QUIT(2);

    private final int value;

    GameCommand(int value) {
        this.value = value;
    }

    public static boolean isRestart(int input) {
        return input == RESTART.value;
    }
}