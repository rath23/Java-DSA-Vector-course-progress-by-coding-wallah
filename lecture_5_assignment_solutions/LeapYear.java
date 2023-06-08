package lecture_5_assignment_solutions;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Ques 1 : Java program to check whether a year is leap year or not using if-else?

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year : ");
        int year = sc.nextInt();
        if (year % 4 == 0 && year%100 !=0 || year % 400 ==0){
            System.out.printf("%d is a leap year",year);
        }
        else {
            System.out.printf("%d is not a leap year",year);
        }
    }
}
