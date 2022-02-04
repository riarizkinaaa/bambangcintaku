import java.util.*;

public class baru {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double jamdatang;
        double jamkeluar;
        double lamaparkir;
        double biaya;

        System.out.print("Masukan Jam Datang: ");
        jamdatang = input.nextDouble();
        System.out.print("Masukan Jam Keluar: ");
        jamkeluar = input.nextDouble();

        lamaparkir = (jamkeluar - jamdatang) / 10000;
        biaya = lamaparkir * 1000;

        System.out.println("Tarif Parkir per Jam = Rp. 1000,00");
        System.out.println("Lama parkir: " + lamaparkir);
        System.out.println("Total yang Harus Dibayar: " + biaya);

    }

}
