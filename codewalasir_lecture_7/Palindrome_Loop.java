package codewalasir_lecture_7;

import java.util.Scanner;

public class Palindrome_Loop {
    static int rev_Num(int num){
        int rev = 0;
        while(num > 0){
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
        }
        return rev;
    }

    static  boolean palindrome_Func(int num){
        if (rev_Num(num) == num){
            return true;
        }
    return false;
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
