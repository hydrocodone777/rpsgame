import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String playerOne = "";
        String playerTwo = "";
        String rock = "R";
        String paper = "P";
        String scissors = "S";
        String yesorno = "";
        boolean moveOne = false;
        boolean moveTwo = false;
        boolean done = false;
        System.out.println("Rock Paper Scissors. R for Rock, P for Paper, S for Scissors");
        do {
            do {
                moveOne = false;
                Scanner inOne = new Scanner(System.in);
                System.out.println("Player one, make your move (RPS): ");
                playerOne = inOne.nextLine();
                if (playerOne.equalsIgnoreCase(rock)) {
                    moveOne = true;
                } else if (playerOne.equalsIgnoreCase(paper)) {
                    moveOne = true;
                } else if (playerOne.equalsIgnoreCase(scissors)) {
                    moveOne = true;
                } else {
                    System.out.println("Invalid Input");
                }
            }
            while (!moveOne);
            do {
                moveTwo = false;
                Scanner inTwo = new Scanner(System.in);
                System.out.println("Player two, make your move (RPS): ");
                playerTwo = inTwo.nextLine();
                if (playerTwo.equalsIgnoreCase(rock)) {
                    moveTwo = true;
                } else if (playerTwo.equalsIgnoreCase(paper)) {
                    moveTwo = true;
                } else if (playerTwo.equalsIgnoreCase(scissors)) {
                    moveTwo = true;
                } else {
                    System.out.println("Invalid Input");
                }

            }
            while (!moveTwo);
            if (playerOne.equalsIgnoreCase(rock)) {
                if (playerTwo.equalsIgnoreCase(rock)) {
                    System.out.println("Tie");
                } else if (playerTwo.equalsIgnoreCase(paper)) {
                    System.out.println("Player two wins");
                } else if (playerTwo.equalsIgnoreCase(scissors)) {
                    System.out.println("Player one wins");
                }
            }
            if (playerOne.equalsIgnoreCase(paper)) {
                if (playerTwo.equalsIgnoreCase(paper)) {
                    System.out.println("Tie");
                } else if (playerTwo.equalsIgnoreCase(rock)) {
                    System.out.println("Player one wins");
                } else if (playerTwo.equalsIgnoreCase(scissors)) {
                    System.out.println("Player two wins");
                }
            }
            if (playerOne.equalsIgnoreCase(scissors)) {
                if (playerTwo.equalsIgnoreCase(paper)) {
                    System.out.println("Player one wins");
                } else if (playerTwo.equalsIgnoreCase(rock)) {
                    System.out.println("Player two wins");
                } else if (playerTwo.equalsIgnoreCase(scissors)) {
                    System.out.println("Tie");
                }
            }
            Scanner play = new Scanner(System.in);
            System.out.println("Would you like to play again?");
            if (play.hasNextLine()) {
                yesorno = play.nextLine();
                if (yesorno == "Y") {
                    done = false;
                } else if (yesorno == "N") {
                    done = true;
                }
            }
        }
        while (!done);
    }
}