package codewalasir_lecture_7;

import java.util.Scanner;

public class Fibonachi_Rec {
    static int  n1=0;
    static int n2 =1;
    static int n3=0;
    static void  fibonachi_Rec(int num){
       if (num > 0){
           n3=n2+n1;
           System.out.println(n3);
           n1=n2;
           n2=n3;
           fibonachi_Rec(num-1);
       }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get Fibonachi series:");
        int num = sc.nextInt();
        fibonachi_Rec(num);
    }
}
