import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTest {

    Calculator adding;
    Calculator subtracting;
    Calculator multiplying;
    Calculator dividing;

    @Before
    public void before() {
        adding = new Calculator(4, 7);
        subtracting = new Calculator(12, 4);
        multiplying = new Calculator(5, 5);
        dividing = new Calculator(5, 2);

    }

    @Test
    public void canAdd() {
        assertEquals(11, adding.add());
    }

    @Test
    public void canSubtract() {
        assertEquals(8, subtracting.subtract());

    }

    @Test
    public void canMultiply() {
        assertEquals(25, multiplying.multiply());
    }

    @Test
    public void canDivide() {
        assertEquals(2.5, dividing.divide(), 0.1);
    }
}
