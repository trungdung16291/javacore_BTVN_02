import java.util.Scanner;

public class DienTichHCN {
    public static void main(String[] args) {
        System.out.println("Tính diện tích hình chữ nhật");
        System.out.println("nhập vào chiều dài :");
        double a = new Scanner(System.in).nextDouble();
        System.out.println("nhập vào chiều rộng :");
        double b = new Scanner(System.in).nextDouble();
        double chuvi = ( a + b)*2;
        double dientich = a * b;
        System.out.println("Chu vi HCN = "+ chuvi);
        System.out.println("dien tich HCN = " + dientich);
    }
}
