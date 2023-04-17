package baseball;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class InputConvertorTest {

    //잘못된 입력값에 따른 예외 관련 테스트 추가로 필요함
    //입력값의 길이, 타입, 중복여부
    @Test
    @DisplayName("문자열 값이 Integer 타입으로 변환 되었는지 테스트")
    void convertTest() {
        String input = "123";
        List<Integer> integerList = InputConvertor.convert(input);

        for (Integer integer : integerList) {
            assertThat(integer.getClass()).isEqualTo(Integer.class);
        }
    }

    @ParameterizedTest
    @CsvSource(value = {"123", "456", "789"})
    @DisplayName("문자열 값이 Integer 타입으로 변환 되었는지 테스트")
    void convertTest2(String input) {
        List<Integer> integerList = InputConvertor.convert(input);

        for (Integer integer : integerList) {
            assertThat(integer.getClass()).isEqualTo(Integer.class);
        }
    }
}