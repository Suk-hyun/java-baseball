package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ServiceTest {

    Service service = new Service();

    @Test
    @DisplayName("스트라이크의 개수를 구하는 테스트")
    void countStrikeTest() {
        List<Integer> userNumbers = List.of(1, 2, 3);

        service.setComputer(List.of(1, 2, 3));

        int strike = service.countStrike(userNumbers);

        assertThat(strike).isEqualTo(3);
    }

    @Test
    @DisplayName("볼의 개수를 구하는 테스트")
    void countBallTest() {
        List<Integer> userNumbers = List.of(1, 2, 3);

        service.setComputer(List.of(3, 1, 2));

        int ball = service.countBall(userNumbers);

        assertThat(ball).isEqualTo(3);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3,3", "1,3,2,1", "1,2,4,2", "3,1,2,0", "4,5,6,0"}, delimiter = ',')
    void countStrikeTest(int userNum1, int userNum2, int userNum3, int expected) {
        List<Integer> userNumbers = List.of(userNum1, userNum2, userNum3);

        service.setComputer(List.of(1, 2, 3));

        int actual = service.countStrike(userNumbers);

        assertThat(actual).isEqualTo(expected);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3,3", "1,3,2,1", "1,2,4,2", "3,1,2,0", "4,5,6,0"}, delimiter = ',')
    void countBallTest(int userNum1, int userNum2, int userNum3, int expected) {
        List<Integer> userNumbers = List.of(userNum1, userNum2, userNum3);

        service.setComputer(List.of(1, 2, 3));

        int actual = service.countBall(userNumbers);

        assertThat(actual).isEqualTo(expected);
    }
}