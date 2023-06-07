package lecture_2_assignment_solution;

public class Swap_Two_Num_With_3rd_variable {
    public static void main(String[] args) {
        int temp;
        int a = 2;
        int b = 3;
        System.out.printf("The value of a is %d and the value of b is %d before swapping.\n",a,b);
        temp = a;
        a=b;
        b=temp;
        System.out.printf("The value of a is %d and the value of b is %d after swapping.\n",a,b);
    }
}
