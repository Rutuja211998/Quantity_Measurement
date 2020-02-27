
public class QuantityMeasurement {


    public Object feet(Object feet) {
        if (feet instanceof Integer)
        {
            return (int) feet;
        }
        else
        {
            return "Null value";
        }
    }


    public Object inch(Object inch) {
        if (inch instanceof Integer)
        {
            return (int) inch;
        }
        else
        {
            return "Null value";
        }
    }


}