package academy.learnprogramming;

public class Challenge {

    public static void main(String[] args) {

        calcFeetAndInchesToCentimeters(6, 0);
        calcFeetAndInchesToCentimeters(15);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if ((feet >= 0) || ((inches >= 0) || (inches <= 12))){
            double centimeters = inches * 2.54;
            centimeters +=  (feet * 12 * 2.54);
            System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " centimeters.");
            return centimeters;
        }
        else {
            System.out.println("Invalid value.");
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >= 0){
            int feet = (int) inches / 12;
            double remainingInches = (int) inches % 12;
            System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        }
        else {
            System.out.println("Invalid value.");
            return -1;
        }
    }
}
