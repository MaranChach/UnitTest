import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() {
        int actual = Calculator.sum(4, 2);
        int expected = 6;
        assertEquals(expected, actual);
    }

    @Test
    void spacing() {
        int actual = Calculator.spacing(4, 2);
        int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void multiplication() {
        int actual = Calculator.multiplication(4, 2);
        int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void divide() {
        float actual = Calculator.divide(4, 2);
        float expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    void pow(){
        int actual = Calculator.pow(2, 3);
        int expected = 8;
        assertEquals(expected, actual);
    }
}