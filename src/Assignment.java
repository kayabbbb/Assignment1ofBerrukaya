import java.util.Random;
import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {

        int rock = 1;
        int paper = 2;
        int scissor = 3;

        int yourScore = 0;
        int computersScore = 0;
        int end_of_the_game = 5;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();


        while(yourScore!=5 && computersScore!=5) {

            System.out.println("Choose your move; \n 1:rock \n 2:paper \n 3:scissor");
            int yourChoice = scanner.nextInt();
            System.out.println("You chose" + " " + yourChoice);


            int min = 1;
            int max = 3;
            int computer = random.nextInt(max) + min;
            System.out.println("Computer's move is " + computer );


            if (yourChoice == computer) {
                System.out.println("Deuce! No winner, no points!");
                System.out.println("Your Score:" + yourScore + "\nComputer's Score:" + computersScore);
            }


            else if ((yourChoice == 1 && computer == 2) || (yourChoice == 2 && computer == 3) || (yourChoice == 3 && computer == 1)) {
                System.out.println("You lost this round!");
                computersScore++;
                System.out.println("Your Score:" + yourScore + "\nComputer's Score:" + computersScore);
            }


            else if (yourChoice!=1 && yourChoice!=2 && yourChoice!=3){
                System.out.println("Invalid choice! Please try again");
                System.out.println("Your Score:" + yourScore + "\nComputer's Score:" + computersScore);
            }


            else {
                System.out.println("You won this round!");
                yourScore++;
                System.out.println("Your Score:" + yourScore + "\nComputer's Score:" + computersScore);
            }
        }



        if (yourScore==5) {
            System.out.println("Congratulations! You won the game!");
        }

        else{
            System.out.println("Bad game! You lost the game!");
        }

    }
}
