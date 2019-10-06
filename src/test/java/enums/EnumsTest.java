package enums;

import course.enums.PrinterType;
import org.junit.Assert;
import org.junit.Test;

public class EnumsTest {

    @Test
    public void testEnum() {
        Assert.assertEquals(PrinterType.DOT_MATRIX,
                PrinterType.matchPrinterType("Imprimanta matriceala"));
    }

    @Test(expected = PrinterType.UnknownPrinter.class)
    public void testUnknownPrinter() {
        PrinterType.matchPrinterType("Imprimanta buna");
    }
}
