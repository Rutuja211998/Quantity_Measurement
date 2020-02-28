public class QuantityMeasurement {

    //function for converting feet to inch
    public Object feet(Object feet) {
        if (feet instanceof Integer) {
            int inch = 12 * (int) feet;
            return inch;
        } else {
            return "Null value";
        }
    }

    //function for converting inch to feet
    public Object inch(Object inch) {
        if (inch instanceof Integer) {
            int feet = 12 / (int) inch;
            return feet;
        } else {
            return "Null value";
        }
    }

    //function to convert feet to yard
    public Object Feet(Object Feet) {
        if (Feet instanceof Integer) {
            int yard = (int) Feet / 3;
            return yard;
        } else {
            return "Null value";
        }
    }

    //function to convert inch to yard
    public Object inchtoyard(Object inchtoyard) {
        if (inchtoyard instanceof Integer) {
            int inchconvert = (int) inchtoyard / 36;
            return inchconvert;
        } else {
            return "Null value";
        }
    }

    //function to convert yard to inch
    public Object yardtoinch(Object yardtoinch) {
        if (yardtoinch instanceof Integer) {
            int yardconvert = (int) yardtoinch * 36;
            return yardconvert;
        } else {
            return "Null value";
        }
    }

    //function to convert yard to feet
    public Object Yard(Object Yard) {
        if (Yard instanceof Integer) {
            int yardtofeet = (int) Yard * 3;
            return yardtofeet;
        }
        else {
            return "Null value";
        }
    }

    //function to convert inch to centimeter
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

    //function to add inches
    public Object addinch(Object addinch, Object addinch2) {
        if (addinch instanceof Integer) {
            int addinches = (int) addinch + (int) addinch2;
            return addinches;
        }
        else
        {
            return "Null value";
        }
    }
}
