package baseball.global.validator;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {

    private InputValidator validator;
    InputValidatorTest(){
        validator = new InputValidator();
    }

    @ParameterizedTest
    @ValueSource(strings = {"12a", "1a2", "a12"})
    @DisplayName("숫자 이외의 값 입력에 대한 예외 처리 테스트")
    void validateInputNumericTest(String playerInput) {
        assertThrows(IllegalArgumentException.class,
                () -> validator.validateBaseballNumberInput(playerInput),"숫자 이외에는 입력할 수 없습니다.");
    }
}