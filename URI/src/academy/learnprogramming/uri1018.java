package academy.learnprogramming;

import java.io.IOException;

/*
 * IMPORTANT:
 *      O nome da classe deve ser "Main" para que a sua solução execute
 *      Class name must be "Main" for your solution to execute
 *      El nombre de la clase debe ser "Main" para que su solución ejecutar
 */

import java.util.Scanner;

public class uri1018 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int money = sc.nextInt();

        System.out.println(money);

        int n100 = money / 100;
        money = money - (n100 * 100);
        System.out.println(n100 + " nota(s) de R$ 100,00");

        int n50 = money / 50;
        money = money - (n50 * 50);
        System.out.println(n50+ " nota(s) de R$ 50,00");

        int n20 = money / 20;
        money = money - (n20 * 20);
        System.out.println(n20+ " nota(s) de R$ 20,00");

        int n10 = money / 10;
        money = money - (n10 * 10);
        System.out.println(n10+ " nota(s) de R$ 10,00");

        int n5 = money / 5;
        money = money - (n5 * 5);
        System.out.println(n5+ " nota(s) de R$ 5,00");

        int n2 = money / 2;
        money = money - (n2 * 2);
        System.out.println(n2+ " nota(s) de R$ 2,00");

        System.out.println(money+ " nota(s) de R$ 1,00");


    }

}
