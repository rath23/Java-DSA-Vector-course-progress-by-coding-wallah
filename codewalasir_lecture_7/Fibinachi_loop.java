package codewalasir_lecture_7;

import java.util.Scanner;

public class Fibinachi_loop {
    static void fibonachi_Loop(int num){
        int n1=0;
        int n2=1;
        int n3 = 0;
        if(num == 1){
            System.out.println(n1+n2);
        }
        else {
            while(num>0){
                n3 = n2 + n1;
                System.out.println(n3);
                n1=n2;
                n2=n3;
                num--;
            }

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to get Fibonachi series:");
        int num = sc.nextInt();
        fibonachi_Loop(num);
    }
}
