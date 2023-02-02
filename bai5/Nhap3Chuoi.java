package bai5;

import java.util.Scanner;

public class Nhap3Chuoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhập chuỗi s");
        String s = sc.nextLine();
        System.out.println("nhập chuỗi s1");
        String s1 = sc.nextLine();
        System.out.println("nhập chuỗi s2");
        String s2 = sc.nextLine();

        System.out.println(s.replaceAll(s1,s2));

    }
}
