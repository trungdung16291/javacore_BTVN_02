import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static javax.print.attribute.Size2DSyntax.MM;

public class TinhTuoi {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        String birthday = "1991/02/16";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date parse = simpleDateFormat.parse(birthday);
        Date tuoi = new Date();
        System.out.println(tuoi.getYear()-parse.getYear());
    }
}
