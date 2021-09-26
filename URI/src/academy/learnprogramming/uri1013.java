package academy.learnprogramming;

import java.io.IOException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class uri1013 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maiorAB = ((a + b + abs(a-b)) / 2);
        int maiorABC = ((maiorAB + c + abs(maiorAB - c)) / 2);

        System.out.println(maiorABC + " eh o maior");

    }

}
