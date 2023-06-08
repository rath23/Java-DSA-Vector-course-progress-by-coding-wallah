package lecture_5_assignment_solutions;

import java.util.Scanner;

public class DevisionCalcualter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks of Maths");
        float s1 = sc.nextFloat();
        System.out.println("Enter the marks of Physics");
        float s2 = sc.nextFloat();
        System.out.println("Enter the marks of Chemistry");
        float s3 = sc.nextFloat();
        System.out.println("Enter the marks of English");
        float s4 = sc.nextFloat();
        System.out.println("Enter the marks of Hindi");
        float s5 = sc.nextFloat();
        float percent = (s1+s2+s3+s4+s5)/5;
        if(percent>=60 && s1 >30 && s2 >30 && s3 >30 && s4 >30 && s5 >30  ){
            System.out.printf("Congratulations you have Passed with First Division.\n%.2f is your percentage",percent);
        } else if (percent>=45 && s1 >30 && s2 >30 && s3 >30 && s4 >30 && s5 >30 ) {
            System.out.printf("Congratulations you have Passed with Second Division.\n%.2f is your percentage",percent);
        } else if (percent>=30 && s1 >30 && s2 >30 && s3 >30 && s4 >30 && s5 >30 ) {
            System.out.printf("Congratulations you have Passed with Third Division.\n%.2f is your percentage",percent);
        }
        else {
            System.out.printf("Sorry you are Fail.\n%.2f is your percentage",percent);
        }
    }
}
