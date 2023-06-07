package lecture_2_assignment_solution;

import java.util.Scanner;

public class Check_PrimeNum {
    public static void main(String[] args) {
        System.out.println("Enter the number to check if it is a prime number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean test = false;

        if (num == 1 || num == 2){
            System.out.printf("%d is a prime number.\n",num);
        }

        else{
            for (int i = 2; i < num; ++i){
                if(num % i == 0){
                    System.out.printf("%d is not a prime number.\n",num);
                    test = true;
                    break;
                }
            }

             if(test==false) {
                System.out.printf("%d is a prime number.\n",num);
            }
        }//else ends here
    }
}
