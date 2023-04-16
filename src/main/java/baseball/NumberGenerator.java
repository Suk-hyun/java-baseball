package baseball;

import camp.nextstep.edu.missionutils.Randoms;

import java.util.ArrayList;
import java.util.List;

public class NumberGenerator {
    static final int NUMBER_LENGTH = 3;

    public List<Integer> createRandomNumbers() {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            int randomNumber = Randoms.pickNumberInRange(1, 9);
            result.add(randomNumber);
        }
        return result;
    }
}
