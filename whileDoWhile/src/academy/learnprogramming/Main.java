package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//	    int count = 1;
//	    while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//	    count = 1;
//	    while(true) {
//	        if (count == 6){
//	            break;
//            }

//        count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count++;
//
//            if(count > 100) {
//                break;
//            }
//        } while(count != 6);

//	    for (int i = 1; i<7; i++){
//            System.out.println("Count value is " + i);
//        }
//	    for (count = 1; count<7; count++){
//            System.out.println("Count value is " + count);
//        }

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber){
//
//            number++;
//            if (!isEvenNumber(number)){
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }
//    }

        int number = 4;
        int finishNumber = 20;
        int evenNumbersFound = 0;

        while (number <= finishNumber){

            number++;
            if (!isEvenNumber(number)){
                continue;
            }

            System.out.println("Even number " + number);
            evenNumbersFound++;

            if (evenNumbersFound >= 5){
                break;
            }
        }

        System.out.println("Number of even numbers: " + evenNumbersFound);
    }

    public static boolean isEvenNumber (int number){

                if ((number % 2) == 0) {
                    return true;
                }
                else {
                    return false;
                }

    }

}
