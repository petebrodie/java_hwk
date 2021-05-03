import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(9, 50);
    }

    @Test
    public void hasPaperLeft() {
        assertEquals(9, printer.getPaper());

    }

    @Test
    public void canPrintWhenEnoughPaper() {
        assertEquals("The print has completed", printer.print(2, 2));
    }

    @Test
    public void cannotPrintWhenNotEnoughPaper() {
        assertEquals("Not enough paper", printer.print(12, 4));
    }

}
