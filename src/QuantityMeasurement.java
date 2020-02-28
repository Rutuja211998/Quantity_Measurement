public class QuantityMeasurement {

    public Object feet(Object feet) {
        if (feet instanceof Integer) {
            int inch = 12 * (int) feet;
            return inch;
        } else {
            return "Null value";
        }
    }

    public Object inch(Object inch) {
        if (inch instanceof Integer) {
            int feet = 12 / (int) inch;
            return feet;
        } else {
            return "Null value";
        }
    }

    public Object Feet(Object Feet) {
        if (Feet instanceof Integer) {
            int yard = (int) Feet / 3;
            return yard;
        } else {
            return "Null value";
        }
    }

    public Object inchtoyard(Object inchtoyard) {
        if (inchtoyard instanceof Integer) {
            int inchconvert = (int) inchtoyard / 36;
            return inchconvert;
        } else {
            return "Null value";
        }
    }

    public Object yardtoinch(Object yardtoinch) {
        if (yardtoinch instanceof Integer) {
            int yardconvert = (int) yardtoinch * 36;
            return yardconvert;
        } else {
            return "Null value";
        }
    }
}
