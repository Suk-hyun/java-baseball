package baseball.exceptions;

import java.util.Objects;

public class AfterGameInputException {

    public static void checkException(String input) throws IllegalArgumentException{
        if (isIllegalInput(input)) {
            throw new IllegalArgumentException("입력값은 1 또는 2 만 가능합니다.");
        }

    }

    private static boolean isIllegalInput(String input) {
        return !Objects.equals(input, "1") && !Objects.equals(input, "2");
    }
}