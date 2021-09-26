package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        Player player = new Player();
//        player.name = "Jonn";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Jonn", 100, "Dagger");
        System.out.println("Initial health is " + player.getHealth());
        int damage = 25;
        player.loseHealth(damage);
        System.out.println("Remaining health is " + player.getHealth());
        int shrooms = 100;
        player.addHealth(shrooms);
        System.out.println("Restored health is " + player.getHealth());

    }
}
