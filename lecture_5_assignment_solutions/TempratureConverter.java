package lecture_5_assignment_solutions;

import java.util.Scanner;

public class TempratureConverter {
    public static void main(String[] args) {
        System.out.println("Press c to convert Fahrenheit to Celsius and Press f to convert  Celsius to  Fahrenheit : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if(input.equalsIgnoreCase("c")){
            System.out.println("Enter the temperacture in Fahrenheit.");
            float tmp = sc.nextFloat();
            float result = (tmp -32)*5/9;
            System.out.printf("%.2f F = %.2f C ",tmp,result);
        } else if (input.equalsIgnoreCase("f")) {
            System.out.println("Enter the temperacture in Celsius.");
            float tmp = sc.nextFloat();
            float result = (tmp*9/5)+32;
            System.out.printf("%.2f C = %.2f F ",tmp,result);
        }
        else {
            System.out.println("Please enter a valid input.");
        }
    }
}
