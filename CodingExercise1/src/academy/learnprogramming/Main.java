package academy.learnprogramming;

public class Main {

    public static long toMilesPerHour (double kilometersPerHour){
        double milesPerHour;

        if (kilometersPerHour < 0){
            return -1;
        }
        else {
            milesPerHour = Math.round(kilometersPerHour / 1.609);
            return (long) milesPerHour;
        }
    }

    public static void printConversion (double kilometersPerHour){
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if (kilometersPerHour < 0 ){
            System.out.println("Invalid Value");
        }
        else {
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h");
        }
    }

}
