package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void add_ShouldReturnSum_WhenGivenTwoPositiveNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(2, 3);

        assertEquals(5, result);
    }

    @Test
    void add_ShouldReturnCorrectResult_WhenGivenNegativeNumber() {
        Calculator calculator = new Calculator();

        int result = calculator.add(-2, 3);

        assertEquals(1, result);
    }

    @Test
    void add_ShouldReturnZero_WhenAddingOppositeNumbers() {
        Calculator calculator = new Calculator();

        int result = calculator.add(5, -5);

        assertEquals(0, result);
    }
}