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

    public Object Yard(Object Yard) {
        if (Yard instanceof Integer) {
            int yardtofeet = (int) Yard * 3;
            return yardtofeet;
        }
        else {
            return "Null value";
        }
    }

    public Object inchtocm(Object inchtocm) {
        if (inchtocm instanceof Double) {
            double centimeter = (double) inchtocm / 2.54;
            return centimeter;
        }
        else
        {
            return "Null value";
        }
    }
}
