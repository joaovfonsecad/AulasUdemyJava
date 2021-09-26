package academy.learnprogramming;

public class exercise9 {

    public static void main(String[] args) {
        printYearsAndDays(561600);
    }

    public static void printYearsAndDays (long minutes){

        long years;
        long days;

        if (minutes < 0) {
            System.out.println("Invalid Value");
        } else {
            days = minutes / 1440;
            long daysRemainder = minutes % 1440;
            years = days / 365;
            daysRemainder += days % 365;

            System.out.println(minutes + " min = " + years + " y and " + daysRemainder + " d");
        }
    }

}
