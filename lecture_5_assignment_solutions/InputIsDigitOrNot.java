package lecture_5_assignment_solutions;

import java.util.Scanner;

public class InputIsDigitOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        boolean num = sc.hasNextInt();
        if(num){
            System.out.println("The input you entered has digits only");
        }
        else {
            System.out.println("The input you entered has other characters also other than digits.");
        }
    }
}
