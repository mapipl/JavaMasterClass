package academy.learnprogramming;

public class Methods {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);
        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);
        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);
        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    public static void displayHighScorePosition(String playerName, int highScorePosition) {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");
    }

    public static int calculateHighScorePosition(int playScore) {

//        if (playScore >= 1000) {
//            return 1;
//        } else if (playScore >= 500) {
//            return 2;
//        } else if (playScore >= 100) {
//            return 3;
//        }
//        return 4;

        int position = 4;
        if (playScore >= 1000) {
            position = 1;
        } else if (playScore >= 500) {
            position = 2;
        } else if (playScore >= 100) {
            position = 3;
        }
        return position;

    }
}
