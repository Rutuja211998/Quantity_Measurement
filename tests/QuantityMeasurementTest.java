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
    public void TestfeetTypeCheck() throws Exception {
        Object result = tests.feet(1);
        boolean b = Integer.class.isInstance(result);
        assertEquals(true, b);
    }

    @Test
    public void TestCheckforEqualityfeet() throws Exception {
        Object result = tests.feet(1);
        assertEquals(12, result);
    }

    @Test
    public void TestinchNullValue() throws Exception {
        Object result = tests.inch(null);
        assertEquals("Null value", result);
    }

    @Test
    public void TestinchTypeCheck() throws Exception {
        Object result = tests.inch(1);
        boolean b = Integer.class.isInstance(result);
        assertEquals(true, b);
    }

    @Test
    public void TestCheckforEqualityinch() throws Exception {
        Object result = tests.inch(12);
        assertEquals(1, result);
    }

    @Test
    public void ZerofeetZeroinch() throws Exception {
        Object result = tests.feet(0);
        assertEquals(0,result);
    }

    @Test
    public void OnefeetnotequalOneinch() throws Exception {
        Object result = tests.feet(1);
        assertNotEquals(1, result);
    }

    @Test
    public void OneinchnotequalOnefeet() throws Exception {
        Object result = tests.inch(1);
        assertNotEquals(1,result);
    }

    @Test
    public void OnefeetTwelveinch() throws Exception {
        Object result = tests.feet(1);
        assertEquals(12, result);
    }

    @Test
    public void TwelveinchOnefeet() throws Exception {
        Object result = tests.inch(12);
        assertEquals(1, result);
    }

    @Test
    public void ThreefeetOneyard() throws Exception {
        Object result = tests.Feet(3);
        assertEquals(1, result);
    }

    @Test
    public void OnefeetnotOneyard() throws Exception {
        Object result = tests.Feet(1);
        assertNotEquals(1, result);
    }

    @Test
    public void OneinchnotOneyard() throws Exception {
        Object result = tests.inchtoyard(1);
        assertNotEquals(1, result);
        }

    @Test
    public void Oneyard36inch() throws Exception {
        Object result = tests.yardtoinch(1);
        assertEquals(36, result);
    }

    @Test
    public void ThirtysixinchOneyard() throws Exception {
        Object result = tests.inchtoyard(36);
        assertEquals(1, result);
    }

    @Test
    public void  Oneyard3feet() throws Exception {
        Object result = tests.Yard(1);
        assertEquals(3, result);
    }

    @Test
    public void  Twoinch5cm() throws Exception {
        Object result = tests.inchtocm(5.08);
        assertEquals(2.0, result);
    }
}