package code_wallah_lecture_6;

import java.util.Scanner;

public class Lec_6_Hw {
    public static void main(String[] args) {
        // Question 1:Sum of n natural numbers taking user input n?

      /*  System.out.println("Enter the number n for the sum of n natural number :");
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        short sum=0;
        for(int i = num ; i>0 ; i--){
           sum += i;
        }
        System.out.printf("The sum of first %d natural number is %d ",num,sum);
    */


        //Question 2:Print sum of odd natural numbers taking user input n ?

        /*
        System.out.println("Printing the sum of odd \'n\' natural numbers");
        System.out.println("Enter the number :");
        Scanner sc = new Scanner(System.in);
        short num = sc.nextShort();
        short sum = 0;
        for (int i = num; i > 0; i--) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.printf("The sum of firts %d n odd natural numbers are %d",num,sum);
        */

        // Question 3:Print each characters separate of string for each loop?

        /*
        String a = "Hello world";
        //char ch[] = a.toCharArray(); note for each won't work on string so we have to use  .toCharArray()

        for (char i : a.toCharArray()){
            System.out.println(i);
            System.out.println("-------------");
        }
        */


        // Question 3:Print the digits of Any Numbers taking user input number??

        /*
        System.out.println("Enter the Number to get the digits :");
        Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       int [] arr = new int[10];
       int count =0;
        while (number>0){
            int remainder = number % 10;
            arr[count]=remainder;
            count++;
            number/=10;
        }
        for (int i = (count-1);i>=0;i--){
            System.out.println(arr[i]);
        }
        */

        // Question 4 : Print all Armstrong numbers between 1-1000

        /*
        for(int i=1;i<=1000;i++){

          if(i>0 && i<10){
                System.out.println(i);
            }
          else if (i>=10 && i <100){
              int num = i;
              int sum = 0;
              while (num > 0) {
                  int remainder = num % 10;
                  sum = sum + remainder * remainder;
                  num /= 10;
              }
              if (sum == i) {
                  System.out.println(i);
              }
          }
          else if (i>=100 && i <1000){
              int num = i;
              int sum = 0;
              while (num > 0) {
                  int remainder = num % 10;
                  sum = sum + remainder * remainder*remainder;
                  num /= 10;
              }
              if (sum == i) {
                  System.out.println(i);
              }
          }
        }
        */

        // Question 5 : Print all ASCII values of characters?

        for (int i =0;i<=127;i++){
            System.out.printf("The ASCII value of %c is %d",(char)i,i);
            System.out.println("");
        }



    }
}
