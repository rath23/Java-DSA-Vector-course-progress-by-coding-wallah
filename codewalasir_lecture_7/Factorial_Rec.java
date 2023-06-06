package codewalasir_lecture_7;


import java.util.Scanner;

public class Factorial_Rec {
    static int fact_Rec(int num){
        if (num == 0){
            return 1;
        }
        else {
            return num * fact_Rec(num-1);
        }
    }
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fact_Rec(num);
        System.out.printf("The factorial of %d is %d",num,result);
    }
}
