package academy.learnprogramming;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
//        int value = 1;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        }
//        else if (value == 2) {
//            System.out.println("Value was 2");
//        }
//        else {
//            System.out.println("Value was not 1 or 2");
//        }

        System.out.println("");

        int switchValue = 1;

        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;

            case 2:
                System.out.println("Value was 2");
                break;

            case 3: case 4: case 5:
                System.out.println("Was a 3 or a 4 or a 5");
                System.out.println("Actually was a " + switchValue);
                break;

            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char char1 = 'A';

        switch (char1){
            case 'A':
                System.out.println("Value was A");
                break;
            case 'B':
                System.out.println("Value was B");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("Value was " + char1);
                break;
            default:
                System.out.println("COuld not find A, B, C, D or E");
                break;
        }

        String month = "January";
        switch (month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not sure");
                break;
        }

    }
}
