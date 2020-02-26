import org.junit.Test;

import javax.management.AttributeList;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    QuantityMeasurement tests = new QuantityMeasurement();

    @Test
    public void Testfeetvalue() throws Exception {
        Object result = tests.feet(0);
        assertEquals(0, result);
    }

    @Test
    public void Testnullvalue() throws Exception {
        Object result = tests.feet(null);
        assertEquals("Null value", result);
    }

}