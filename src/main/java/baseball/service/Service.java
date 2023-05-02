package baseball.service;

import baseball.domain.Computer;

import java.util.List;

public class Service {

    Computer computer;

    public void setComputer(List<Integer> randomNumbers) {
        computer = new Computer(randomNumbers);
    }

    public int countStrike(List<Integer> userNumbers) {
        int strike = computer.countSameNumberInSameIndex(userNumbers);
        return strike;
    }

    public int countBall (List<Integer> userNumbers) {
        int countSameNumber = computer.countSameNumber(userNumbers);

        int strike = countStrike(userNumbers);
        int ball = countSameNumber - strike;
        return ball;
    }
}