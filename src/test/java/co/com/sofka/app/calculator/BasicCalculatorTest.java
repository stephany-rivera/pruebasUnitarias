package co.com.sofka.app.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing sum: 1+1=2")
    public void sum() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sum(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0,    1,   1",
            "1,    2,   3",
            "49,  51, 100",
            "1,  100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }

    @Test
    @DisplayName("Testing sub: 5-3=2")
    public void sub() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 3L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.sub(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several substractions")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "8,    3,   5",
            "16,    2,   14",
            "550,  48, 502",
            "447,  100, 347"
    })
    public void severalSubs(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.sub(first, second),
                () -> first + " + " + second + " should equal " + expectedResult);
    }


}


