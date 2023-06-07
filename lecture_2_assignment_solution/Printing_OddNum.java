package lecture_2_assignment_solution;

public class Printing_OddNum {
    public static void main(String[] args) {
        System.out.println("Printing odd numbers from 1 to 100");
        for (int i=1;i<=100;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
