package academy.learnprogramming;

import java.time.Year;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        System.out.println(isLeapYear(year));
    }

    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999){
            if (year % 4 == 0){
                if (year % 100 == 0 && year % 400 != 0){
                    return false;
                }
                else {
                    return true;
                }
            }
            else{
                return false;
            }
        }
        else {
            return false;
        }
    }
}
