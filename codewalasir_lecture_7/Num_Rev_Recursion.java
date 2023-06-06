package codewalasir_lecture_7;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class Num_Rev_Recursion {
    static int rev = 0;
    static int reverse(int num){

        if(num > 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num /= 10;
            return reverse(num);
        }
        return rev;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the number you want to reverse");
        //int num = sc.nextInt();
        System.out.println(reverse(1234));
    }
}
