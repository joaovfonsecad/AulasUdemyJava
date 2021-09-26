package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim ", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Bob ", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Percy ", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert ", position);

        position = calculateHighScorePosition(1000);
        displayHighScorePosition("Louise ", position);

        position = calculateHighScorePosition(500);
        displayHighScorePosition("Carol ", position);

        position = calculateHighScorePosition(100);
        displayHighScorePosition("Frank ", position);

    }

    public static void displayHighScorePosition(String playerName, int position) {
        System.out.println(playerName + "managed to get into position " + position + " on the high score table.");
    }

    public static int calculateHighScorePosition(int score) {
        int position = 4;

        if (score >= 1000){
            position = 1;
        }
        else if (score >= 500){
            position = 2;
        }
        else if (score >= 100){
            position = 3;
        }
        return position;
    }

}
