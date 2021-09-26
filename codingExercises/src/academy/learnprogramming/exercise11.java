package academy.learnprogramming;

public class exercise11 {

    public static void main(String[] args) {
        System.out.println( isCatPlaying(false, 25));
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {

        if (summer) {
            return temperature >= 25 && temperature <= 45;
        } else {
            return temperature >= 25 && temperature <= 35;
        }
    }
}
