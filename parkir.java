import java.util.Scanner;

public class parkir {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int masuk, keluar, pembayaran;
        System.out.print("parkir masuk= ");
        masuk = input.nextInt();
        System.out.print("keluar parkir= ");
        keluar = input.nextInt();
        System.out.println("1.motor");
        System.out.println("2.mobil");
        System.out.print("pilih kendaraan anda ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                int lparkir = (keluar - masuk) + masuk;
                pembayaran = (masuk * 1000) + 4000;
                System.out.println("anda parkir selama= " + lparkir + " jam");
                System.out.println("biaya parkir= " + pembayaran);
                break;
            case 2:
                int lparkir1 = (keluar - masuk) + masuk;
                System.out.println("anda parkir selama= " + lparkir1 + " jam");
                pembayaran = (masuk * 1000) + 8000;
                System.out.println("biaya parkir= " + pembayaran);
                break;
        }

        // if (keluar < masuk) {
        // pembayaran = (keluar - masuk) + 4000;
        // System.out.println("biaya parkir= " + pembayaran);
        // } else if (masuk > keluar) {
        // pembayaran = (masuk * 1000) + 4000;
        // System.out.println("biaya parkir= " + pembayaran);

        // }

    }

}
