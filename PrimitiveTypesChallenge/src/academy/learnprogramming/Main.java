package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
        byte byteValue = 10;
        short shortValue = 25;
        int intValue = 50;
        long longTotal = 50000L + 10L * (intValue + byteValue + shortValue);

        System.out.println(longTotal);
        short shortTotal = (short) (1000 + 10 * (intValue + byteValue + shortValue));
        System.out.println(shortTotal);
    }
}
