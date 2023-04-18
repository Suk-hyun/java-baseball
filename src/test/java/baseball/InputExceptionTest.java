package baseball;

import baseball.exceptions.AfterGameInputException;
import baseball.exceptions.InGameInputException;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.Assertions.*;

public class InputExceptionTest {

    @ParameterizedTest
    @CsvSource(value = {"1234", "1e2", "112", "103"})
    void inGameInputExceptionTest(String input) {

        assertThatThrownBy(() -> InGameInputException.checkException(input))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @ParameterizedTest
    @CsvSource(value = {"3", "e"})
    void afterGameInputExceptionTest(String input) {

        assertThatThrownBy(() -> AfterGameInputException.checkException(input))
                .isInstanceOf(IllegalArgumentException.class);
    }
}