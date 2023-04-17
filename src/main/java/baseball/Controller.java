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
            String input = InputView.getUserNumbers();
            List<Integer> userNumbers = InputConvertor.convertToIntList(input);

            int strike = service.countStrike(userNumbers);
            int ball = service.countBall(userNumbers);

            if (strike == 3) {
                break;
            }
        }
        newGameOrFinishGame();
    }

    public void newGameOrFinishGame() {
        String input = InputView.getRestartOrFinish();
        int command = InputConvertor.convertToInt(input);

        if (command == 1) {
            setGame();
            playGame();
        }
        if (command == 2) {
        }
    }
}