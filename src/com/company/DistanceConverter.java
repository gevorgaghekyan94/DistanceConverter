package com.company;

public class DistanceConverter {

    public static double convertMilesToMeters(double miles) {
        return miles * 1609.344;
    }

    public static double convertMetersToMiles(double meters) {
        return meters * 0.0006213;
    }

    public static double convertInchToCentimeter(double inch) {
        return inch * 2.54;
    }

    public static double convertCentimeterToInch(double centimeter) {
        return centimeter * 0.393701;
    }
}
