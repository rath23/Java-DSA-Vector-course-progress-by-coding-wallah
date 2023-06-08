package lecture_5_assignment_solutions;

import java.util.Scanner;

public class PercentageCalculater {
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
        if(percent>=90){
            System.out.printf("%.2f is your percentage and your garde is \"A\" ",percent);
        } else if (percent>=80) {
            System.out.printf("%.2f is your percentage and your garde is \"B\" ",percent);
        } else if (percent>=70) {
            System.out.printf("%.2f is your percentage and your garde is \"C\" ",percent);
        } else if (percent>=60) {
            System.out.printf("%.2f is your percentage and your garde is \"D\" ",percent);
        }else if (percent>=40){
            System.out.printf("%.2f is your percentage and your garde is \"E\" ",percent);
        }
        else {
            System.out.printf("%.2 is your percentage and your garde is \"F\" ",percent);
        }

    }
}
