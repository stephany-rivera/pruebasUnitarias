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
    @DisplayName("Testing substract: 5-3=2")
    public void substract() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 3L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.substract(number1, number2);

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
    public void severalSubstractions(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.substract(first, second),
                () -> first + " - " + second + " should equal " + expectedResult);
    }


    @Test
    @DisplayName("Testing multiply: 5*8=40")
    public void multiply() {
        // Arrange
        Long number1 = 5L;
        Long number2 = 8L;
        Long expectedValue = 40L;

        // Act
        Long result = basicCalculator.multiply(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "8,    3,   24",
            "16,    2,   32",
            "550,  48, 26400",
            "447,  100, 44700"
    })
    public void severalMultiplications(Long first, Long second, Long expectedResult) {
        assertEquals(expectedResult, basicCalculator.multiply(first, second),
                () -> first + " * " + second + " should equal " + expectedResult);
    }


    @Test
    @DisplayName("Testing division: 4/2=2")
    public void division() {
        // Arrange
        Long number1 = 4L;
        Long number2 = 2L;
        Float expectedValue = 2F;

        // Act
        Float result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "8,    4,   2",
            "16,    2,   8",
            "32,  8, 4",
            "40,  0, 0"
    })
    public void severalDivisions(Long first, Long second, Float expectedResult) {
        assertEquals(expectedResult, basicCalculator.division(first, second),
                () -> first + " / " + second + " should equal " + expectedResult);
    }



}




