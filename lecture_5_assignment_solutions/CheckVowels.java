package lecture_5_assignment_solutions;

import java.util.Scanner;

public class CheckVowels {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character to check");
        char ch = sc.next().charAt(0);
        int asciiStart = 65;
        int asciiEnd = 90;
        int asciiStart2 = 97;
        int asciiEnd2 = 122;
        if ((int)ch >= asciiStart && (int)ch<=asciiEnd || (int)ch >= asciiStart2 && (int)ch<=asciiEnd2 ) {
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                System.out.println("The Alphabet you entered is a vowel");
            } else {
                System.out.println("The Alphabet you entered is not a vowel");
            }
        }
        else {
            System.out.println("The character you entered is not an alphabet..");
        }

        }
        }


