import java.util.Scanner;

public class PhuongTrinhBac2 {
    public static void main(String[] args) {
        System.out.println("giải phương trình bậc 2");
        Scanner sc = new Scanner(System.in);

        System.out.println("nhập vào a :");
        double a = sc.nextDouble();
        System.out.println("nhập vào b :");
        double b = sc.nextDouble();
        System.out.println("nhập vào c :");
        double c = sc.nextDouble();
        double denta = ( b * b) - (4 * a * c);
        System.out.println("denta = " +denta);
        double x1 = (-b + Math.sqrt(denta)) / (2*a);
        System.out.println("Nghiệm pt là " + x1);
        double x2 = (-b - Math.sqrt(denta)) / (2*a);
        System.out.println("nghiệm pt là " + x2);
    }
}
