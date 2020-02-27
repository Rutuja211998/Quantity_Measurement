import org.junit.Test;

import javax.management.AttributeList;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {
    QuantityMeasurement tests = new QuantityMeasurement();

    @Test
    public void TestfeetValue() throws Exception {
        Object result = tests.feet(0);
        assertEquals(0, result);
    }

    @Test
    public void TestNullValue() throws Exception {
        Object result = tests.feet(null);
        assertEquals("Null value", result);
    }

    @Test
    public void TestTypeCheck() throws Exception {
        Object result = tests.feet(1);
        boolean b = Integer.class.isInstance(result);
        assertEquals(true, b);
    }

    @Test
    public void TestCheckforEquality() throws Exception {
        Object result = tests.feet(1);
        assertEquals(1, result);
    }

    @Test
    public void TestinchNullValue() throws Exception {
        Object result = tests.inch(null);
        assertEquals("Null value", result);
    }

}