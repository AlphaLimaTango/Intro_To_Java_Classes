import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }


    @Test
    public void canAdd(){
        assertEquals(5, calculator.add(1, 4));
    }

    @Test
    public void canSubtract(){
        assertEquals(3, calculator.subtract(8, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals(21, calculator.multiply(7, 3));
    }

    @Test
    public void canDivide(){
        assertEquals(2, calculator.divide(6, 3));
    }
}
