package lecture_5_assignment_solutions;

import java.util.Scanner;

public class CheckAlphabetSpecialChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check");
        char ch = sc.next().charAt(0);
        int asciiStart = 65;
        int asciiEnd = 90;
        int asciiStart2 = 97;
        int asciiEnd2 = 122;
        int asciiNumStrt =48;
        int asciiNumEnd = 57;
        if ((int)ch >= asciiStart && (int)ch<=asciiEnd || (int)ch >= asciiStart2 && (int)ch<=asciiEnd2 ){
            System.out.println("The character you entered is an alphabet..");
        } else if ((int)ch >= asciiNumStrt && (int)ch<= asciiNumEnd) {
            System.out.println("The character you entred is a number ");
        } else {
            System.out.println("The character you entered is special character");
        }
    }
}
