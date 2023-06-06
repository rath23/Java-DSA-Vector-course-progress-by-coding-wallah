package codewalasir_lecture_7;

public class Print_A_Z_Rec {
    static void print_A_Z_rec(int num) {

       if(num<=90) {
           System.out.println((char) num);
           print_A_Z_rec(num + 1);
       }
    }


    public static void main(String[] args) {
        System.out.println("Print Alphabet using recursion");
        print_A_Z_rec(65);

    }
}
