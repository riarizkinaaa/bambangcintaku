import java.util.Scanner;

public class contoh2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmasuk, jpulang, pembayaran;
        System.out.println("masukkan jam masuk= ");
        jmasuk = input.nextInt();
        System.out.println("masukkan jam pulang= ");
        jpulang = input.nextInt();
        if (jmasuk < jpulang) {
            int hasil = (jmasuk - jpulang) * 60;
            System.out.println("anda parkir selama=" + hasil);
        } else {
            int hasil = (jpulang - jmasuk) * 60;
            System.out.println("anda parkir selama=" + hasil);
        }
    }
}
