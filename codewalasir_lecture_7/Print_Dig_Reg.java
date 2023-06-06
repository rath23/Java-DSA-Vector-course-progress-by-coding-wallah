package codewalasir_lecture_7;

public class Print_Dig_Reg {
    static  void print_Dig_Reg(int num){
        if (num >0){
            int temp = num;
            print_Dig_Reg(temp/=10);
            System.out.println(num%10);

        }
    }
    public static void main(String[] args) {
        print_Dig_Reg(123456);
    }
}
