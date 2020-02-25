import org.junit.Test;

import static org.junit.Assert.*;

public class QuantityMeasurementTest {

    @Test
    public void TestfeetToInch() throws Exception{
        QuantityMeasurement test1 = new QuantityMeasurement();
        int feet = 0;
        int result = test1.feetToInch(feet);
        assertEquals(0, result);
    }
}