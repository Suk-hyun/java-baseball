package baseball;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class ComputerTest {

    Computer computer;

    @BeforeEach
    void setComputer() {
        List<Integer> computerNumbers = List.of(1, 2, 3);
        computer = new Computer(computerNumbers);
    }

    @Test
    @DisplayName("같은 수의 개수를 반환 하는 기능 테스트")
    void countSameNumberTest() {
        List<Integer> userNumbers = List.of(1, 2, 3);

        int countSameNumber = computer.countSameNumber(userNumbers);

        assertThat(countSameNumber).isEqualTo(3);
    }

    @ParameterizedTest
    @CsvSource(value = {"1:2:3:3", "1:2:9:2", "1:8:9:1"}, delimiter = ':')
    @DisplayName("같은 수의 개수를 반환 하는 기능 테스트")
    void countSameNumberTest2(int userNumber1, int userNumber2, int userNumber3, int expected) {

        List<Integer> userNumbers = List.of(userNumber1, userNumber2, userNumber3);

        int actual = computer.countSameNumber(userNumbers);

        assertThat(actual).isEqualTo(expected);
    }

    @Test
    @DisplayName("같은 숫자가 같은 인덱스에 있는지 알 수 있는 기능 테스트")
    void sameNumSameIndexTest() {
        List<Integer> userNumbers = List.of(1, 2, 4);

        int result = computer.countSameNumberInSameIndex(userNumbers);

        assertThat(result).isEqualTo(2);
    }

    @ParameterizedTest
    @CsvSource(value = {"1,2,3,3", "1,2,4,2", "1,4,5,1", "4,5,6,0"}, delimiter = ',')
    @DisplayName("같은 숫자가 같은 인덱스에 있는지 알 수 있는 기능 테스트")
    void sameNumSameIndexTest2(int userNumber1, int userNumber2, int userNumber3, int expected) {

        List<Integer> userNumbers = List.of(userNumber1, userNumber2, userNumber3);

        int actual = computer.countSameNumberInSameIndex(userNumbers);

        assertThat(actual).isEqualTo(expected);
    }



}