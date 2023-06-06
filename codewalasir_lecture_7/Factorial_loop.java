package codewalasir_lecture_7;

import java.util.Scanner;

public class Factorial_loop {
    static int fact_Loop(int num){
        int result = 1;
        for(int i=num;i>0;i--){
         result *= i;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number whose factorial you want :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = fact_Loop(num);
        System.out.printf("The factorial of %d is %d",num,result);
    }
}
