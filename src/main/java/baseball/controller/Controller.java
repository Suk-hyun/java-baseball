package baseball;


import java.util.List;

public class Controller {
    Service service = new Service();

    public void setGame() {
        List<Integer> randomNumbers = NumberGenerator.createRandomNumbers();
        service.setComputer(randomNumbers);
    }

    public void playGame() {
        while (true) {
            OutputView.requestInputMsg();
            String input = InputView.getUserNumbers();

            InGameInputException.checkException(input);

            List<Integer> userNumbers = InputConvertor.convertToIntList(input);

            int strike = service.countStrike(userNumbers);
            int ball = service.countBall(userNumbers);

            printResult(strike, ball);

            if (strike == 3) {
                break;
            }
        }
        newGameOrFinishGame();
    }

    public void newGameOrFinishGame() {
        OutputView.endGameMsg();
        String input = InputView.getRestartOrFinish();
        AfterGameInputException.checkException(input);

        int command = InputConvertor.convertToInt(input);

        if (command == GameCommand.RESTART.getValue()) {
            setGame();
            playGame();
        }
        if (command == GameCommand.QUIT.getValue()) {
        }
    }

    private void printResult(int strike, int ball) {
        if (ball != 0 && strike != 0) {
            OutputView.printBallAndStrike(ball, strike);
        }
        if (ball == 0 && strike == 0) {
            OutputView.printNothingMsg();
        }
        if (ball != 0 && strike == 0) {
            OutputView.printBall(ball);
        }
        if (ball == 0 && strike != 0) {
            OutputView.printStrike(strike);
        }
    }
}