package baseball;

import baseball.controller.Controller;
import baseball.view.OutputView;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        OutputView.gameStartMsg();
        Controller controller = new Controller();
        controller.setGame();
        controller.playGame();
    }
}
