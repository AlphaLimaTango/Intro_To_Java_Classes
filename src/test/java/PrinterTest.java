import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(150, 500);
    }

    @Test
    public void hasSheets(){
        assertEquals(150, printer.getSheetStock());
    }

    @Test
    public void canPrint(){
        printer.print(35, 2);
        assertEquals(80, printer.getSheetStock());
    }

    @Test
    public void hasEnoughPaper(){
        printer.triesToPrintIfItHasEnoughPaper(40, 2);
        assertEquals(70, printer.getSheetStock());
    }

    @Test
    public void canRefill(){
        printer.print(5, 2);
        printer.refill(100);
        assertEquals(240, printer.getSheetStock());
    }

    @Test
    public void hasTonerVolume(){
        assertEquals(500, printer.getTonerVolume());
    }

    @Test
    public void reducesTonerBy1EachTimeItPrints(){
        printer.print(4, 5);
        assertEquals(480, printer.getTonerVolume());
    }
}
