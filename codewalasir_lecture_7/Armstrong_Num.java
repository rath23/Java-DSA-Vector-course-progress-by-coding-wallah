package codewalasir_lecture_7;

import java.util.Scanner;

public class Armstrong_Num {
    static int pow(int num1,int num2){
        int result = 1;
        for (int i=0;i<num2;i++){
         result *= num1;
        }
        return result;
    }

    static boolean armstrong_Num(int num){
        int num_val_holder = num;
        int [] arr=new int[8];
        int count =0;
        while(num > 0){
            int remainder = num % 10;
            arr[count]=remainder;
            num /= 10;
            count++;
        }

        int arm_num = 0;
        for (int i = count-1;i>=0;i--){
            arm_num+=pow(arr[i],count);
        }
        System.out.println(arm_num);
        if(arm_num == num_val_holder){
            return true;
        }
        return  false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number to check if it is Armstrong Number:");
        int num = sc.nextInt();
        if(armstrong_Num(num)){
            System.out.printf("%d is an Armstrong Number",num);
        }
        else {
            System.out.printf("%d is not an Armstrong Number",num);
        }
    }
}
