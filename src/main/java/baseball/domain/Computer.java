package baseball.domain;

import java.util.List;

public class Computer {

    private final List<Integer> numbers;

    public Computer(List<Integer> numbers) {
        this.numbers = numbers;

    }

    public int countSameNumber(List<Integer> userNumbers) {
        int result = 0;
        for (int userNumber : userNumbers) {
            if (numbers.contains(userNumber)) {
                result++;
            }
        }
        return result;
    }

    public int countSameNumberInSameIndex(List<Integer> userNumbers) {
        int result = 0;
        for (int i = 0; i < userNumbers.size(); i++) {
            if (isSameNumberInSameIndex(userNumbers, i)) {
                result++;
            }
        }
        return result;
    }

    private boolean isSameNumberInSameIndex(List<Integer> userNumbers, int i) {
        return numbers.get(i) == userNumbers.get(i);
    }
}
