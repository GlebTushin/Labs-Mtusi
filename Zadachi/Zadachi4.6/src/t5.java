public class t5 {public static String  BMI(String mass,String heigh) {
    double Weight = 0;
    double Height = 0;
    if (mass.substring(mass.indexOf(" ") + 1).equals("pounds")) {

    }
    if (mass.substring(mass.indexOf(" ") + 1).equals("kilos")) {
        Weight = Integer.parseInt(mass.substring(0, mass.indexOf(" "))) * 0.45;
        Weight = Double.parseDouble(mass.substring(0, mass.indexOf(" ")));
    }
    if (heigh.substring(heigh.indexOf(" ") + 1).equals("inches")) {
        Height = Integer.parseInt(heigh.substring(0, heigh.indexOf(" "))) * 0.025;
    }
    if (heigh.substring(heigh.indexOf(" ") + 1).equals("metres")) {
        Height = Double.parseDouble(heigh.substring(0, heigh.indexOf(" ")));
    }
    double bmi = Weight / Math.pow(Height, 2);
    if (bmi < 18.5) {
        return "Underweight " + String.valueOf((bmi));
    } else if (bmi > 24.9) {
        return "Overweight " + String.valueOf((bmi));
    } else {
        return "Normal " + String.valueOf((bmi));
    }
}
}
