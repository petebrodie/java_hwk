import org.junit.Before;
import org.junit.Test;
import sun.invoke.empty.Empty;

import static org.junit.Assert.*;

public class WaterBottleTest {

    WaterBottle bottle;
    WaterBottle halfBottle;

    @Before
    public void before() {
        bottle = new WaterBottle((100));
        halfBottle = new WaterBottle(50);
    }

    @Test
    public void hasVolume() {
        assertEquals(100, bottle.getVolume());
    }

    @Test
    public void canDrink() {
        assertEquals(90, bottle.drink());
        assertEquals(80, bottle.drink());
    }

    @Test
    public void canEmpty() {
        assertEquals(0, bottle.empty());

    }

    @Test
    public void canFill() {
        assertEquals(100, halfBottle.fill());
    }
}
