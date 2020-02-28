public class QuantityMeasurement {

        public Object feet(Object feet) {
            if (feet instanceof Integer)
            {
                int inch = 12 * (int) feet;
                return inch;
            }
            else
            {
                return "Null value";
            }
        }

    public Object inch(Object inch) {
        if (inch instanceof Integer)
        {
            int feet = 12 / (int) inch;
            return feet;
        }
        else
        {
            return "Null value";
        }
    }
}
