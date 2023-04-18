package baseball;

import java.util.Arrays;

public class InGameInputException {

    static final int NUMBER_LENGTH = 3;

    public static void checkException(String input) throws IllegalArgumentException {
        checkDigits(input);
        checkLength(input);
        checkDuplicate(input);
    }

    private static void checkDuplicate(String input) {
        String[] inputArray = input.split("");
        String[] result = Arrays.stream(inputArray).distinct().toArray(String[]::new);
        if (result.length < NUMBER_LENGTH) {
            throw new IllegalArgumentException("입력값은 중복되는 값이 없어야 합니다.");
        }
    }

    private static void checkLength(String input) {
        if (input.length() != NUMBER_LENGTH) {
            throw new IllegalArgumentException("입력값은 3자리 여야 합니다.");
        }
    }

    private static void checkDigits(String input) {
        for (int i = 0; i < NUMBER_LENGTH; i++) {
            if (!isInRange(input, i)) {
                throw new IllegalArgumentException("입력값은 1에서 9사이여야 합니다.");
            }
        }
    }

    private static boolean isInRange(String input, int i) {
        return '1' <= input.charAt(i) && input.charAt(i) <= '9';
    }
}