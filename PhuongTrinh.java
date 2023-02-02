import java.io.PrintStream;
import java.util.Scanner;

public class PhuongTrinh {
    public static void main(String[] args) {
        System.out.println("Xin mời nhập vào số a ");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("Xin mời nhập vào số b ");
        double b = new Scanner(System.in).nextDouble();
        double ketqua = -b/a;
        System.out.printf("Nghiệp của phương trình %.4f * x + %.4f = 0 là %.4f ", a, b,ketqua);

    }
}