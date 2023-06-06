package rock_paper_scissors_game;

import java.util.Random;
import java.util.Scanner;

public class Stone_Paper_Scissors {
    public static void main(String[] args) {
        Random rand = new Random();

        int user_Score = 0;
        int comp_score =0;

        String comp_select;


        System.out.println("Welcome to Rock , paper , Scissors Game : ");
        for(int i=0;  i<5;i++) {

            int rand_num = rand.nextInt(9);

            if (rand_num >= 0 && rand_num < 3) {
                comp_select = "r";
            } else if (rand_num > 3 && rand_num <6) {
                comp_select = "p";
            } else {
                comp_select = "s";
            }


            System.out.println("Select r for Rock , p for paper and s for scissors");
            Scanner sc = new Scanner(System.in);
            String user_opt = sc.next();

            if (user_opt.equals("r") || user_opt.equals("s") || user_opt.equals("p")) {


                if (comp_select.equals("r") && user_opt.equals("p") || comp_select.equals("s") && user_opt.equals("r") || comp_select.equals("p") && user_opt.equals("s")) {
                    System.out.println("You won this round ");
                    System.out.printf("Computer have selected %s. \n\n",comp_select);
                    user_Score++;
                } else if (comp_select.equals(user_opt)) {
                    System.out.println("Match draw");
                    System.out.printf("Computer have selected %s. \n\n",comp_select);
                } else {
                    System.out.println("Computer wins this round");
                    System.out.printf("Computer have selected %s. \n\n",comp_select);
                    comp_score++;
                }
            } else {
                System.out.println("Please enter a valid input as mentioned above");
            }
        }


            if(user_Score > comp_score) {
                System.out.println("Congratulations you won");
                System.out.printf("Your Score = %d \nComputer score = %d ", user_Score, comp_score);
            }
            else {
                System.out.println("You lose better luck next time");
                System.out.printf("Your Score = %d \nComputer score = %d ", user_Score, comp_score);
            }





    }
}

