package baseball.view;

import camp.nextstep.edu.missionutils.Console;

public class InputView {

    public static String getUserNumbers() {
        return Console.readLine();
    }

    public static String getRestartOrFinish() {
        return Console.readLine();
    }
}