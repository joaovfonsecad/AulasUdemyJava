package academy.learnprogramming;

import java.io.IOException;
import java.util.Scanner;

public class uri1021 {
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double money = sc.nextDouble();

        System.out.println("NOTAS:");

        int n100 = (int) money / 100;
        money = money - (n100 * 100.0);
        System.out.println(n100 + " nota(s) de R$ 100,00");

        int n50 = (int) money / 50;
        money = money - (n50 * 50.0);
        System.out.println(n50+ " nota(s) de R$ 50,00");

        int n20 = (int) money / 20;
        money = money - (n20 * 20.0);
        System.out.println(n20+ " nota(s) de R$ 20,00");

        int n10 = (int) money / 10;
        money = money - (n10 * 10.0);
        System.out.println(n10+ " nota(s) de R$ 10,00");

        int n5 = (int) money / 5;
        money = money - (n5 * 5.0);
        System.out.println(n5+ " nota(s) de R$ 5,00");

        int n2 = (int) money / 2;
        money = money - (n2 * 2.0);
        System.out.println(n2+ " nota(s) de R$ 2,00");

        money = money * 100.00;
        if (money - (int) money > 0.5){
            money ++;
        }


        System.out.println("MOEDAS:");

        int m1 = (int) money / 100;
        money = money - m1 * 100.0;
        System.out.println(m1 + " moeda(s) de R$ 1,00");

        int m50 = (int) money / 50;
        money = money - m50 * 50.0;
        System.out.println(m50 + " moeda(s) de R$ 0,50");

        int m25 = (int) money / 25;
        money = money - m25 * 25.0;
        System.out.println(m25 + " moeda(s) de R$ 0,25");

        int m10 = (int) money / 10;
        money = money - m10 * 10.0;
        System.out.println(m10 + " moeda(s) de R$ 0,10");

        int m5 = (int) money / 5 ;
        money = money - m5 * 5.0;
        System.out.println(m5 + " moeda(s) de R$ 0,05");

        int m01 = (int) money;
        System.out.println(m01 + " moeda(s) de R$ 0,01");

    }

}
