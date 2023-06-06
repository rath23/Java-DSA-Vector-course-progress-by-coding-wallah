package codewalasir_lecture_7;

import java.util.Scanner;

public class Panlindrome_Num {

    static int rev = 0;
    static int palindrom_Num_Rec(int num){

        if(num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
            return palindrom_Num_Rec(num);
        }
        return rev;
    }
    static  boolean palindrome_Func(int num) {
        if (palindrom_Num_Rec(num) == num) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check if it is palindrome number:");
        int num = sc.nextInt();
        if(palindrome_Func(num)){
            System.out.printf("%d is a palindrome number...", num);
        }
        else {
            System.out.printf("%d is not a palindrome number...", num);
        }
    }
}
