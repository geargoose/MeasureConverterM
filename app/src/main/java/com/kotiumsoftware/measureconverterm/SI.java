package com.kotiumsoftware.measureconverterm;

public class SI {
    public static final String LENGTH = "length";

    public static final double DECI = 0.1;
    public static final double CENTI = 0.01;
    public static final double MILLI = 0.001;
    public static final double MICRO = 0.0000001;
    public static final double SI = 1;
    public static final double DECA = 10;
    public static final double HECTO = 100;
    public static final double KILO = 1000;
    public static final double MEGA = 1000000;


    static class Value {
        double value;

        public double getValue() {
            return value;
        }

        public void setValue(double value) {
            this.value = value;
        }
    }

    static class Length extends Value {
        public String getConverted(String measure) {
            double r;
            switch (measure) {
                case "m":
                    r = getValue();
                    break;
                case "cm":
                    r = getValue() * CENTI;
                    break;
                case "km":
                    r = getValue() * KILO;
                    break;
                case "dm":
                    r = getValue() * DECI;
                    break;
                default:
                    return "Error";
            }
            return String.valueOf(r);
        }

        public void setConverted(double value, String measure) {
            double r;
            switch (measure) {
                case "m":
                    r = value;
                    break;
                case "cm":
                    r = value * CENTI;
                    break;
                case "km":
                    r = value * KILO;
                    break;
                case "dm":
                    r = value * DECI;
                    break;
                default:
                    r = 0;
            }
            setValue(r);
        }
    }

    static class Speed {
        double si_length;

        public double getSILengthFrom(double prefix) {
            return si_length * prefix;
        }

        public void setSILengthFrom(int si_length, double prefix) {
            this.si_length = si_length / prefix;
        }
    }
}
