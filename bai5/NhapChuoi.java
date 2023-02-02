package bai5;

import java.util.Scanner;

public class NhapChuoi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Xin mời nhập chuỗi bất kỳ");
        String name = sc.nextLine();
        String c = "c";
        System.out.println("vị trí đầu tiên :"+ name.indexOf(c));
        System.out.println("vị trí cuối cùng : " + name.lastIndexOf(c));


    }
}
