import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(5, calculator.add(3,2));
    }

    @Test
    void dif() {
        assertEquals(10, calculator.dif(15,5));
    }

    @Test
    void div() {
        assertEquals(2, calculator.div(20,10));
    }

    @Test
    void times() {
        assertEquals(30, calculator.times(3, 10));
    }

    @Test
    void solver() {
        assertEquals(3, calculator.solver(2,1));
    }
}