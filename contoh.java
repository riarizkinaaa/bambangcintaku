import java.util.Scanner;

class contoh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jam datang : ");
        int datang = sc.nextInt();
        System.out.print("Masukkan menit datang : ");
        int mDatang = sc.nextInt();
        System.out.print("Masukkan jam pulang : ");
        int pulang = sc.nextInt();
        System.out.print("Masukkan menit pulang : ");
        int mPulang = sc.nextInt();

        int InHinM;
        if (datang > pulang) {
            InHinM = (datang - pulang) * 60;
        } else {
            InHinM = (pulang - datang) * 60;
        }

        int InMAll;
        if (mDatang > mPulang) {
            InMAll = (mDatang - mPulang);
        } else {
            InMAll = (mPulang - mDatang);
        }

        int MinTotal = (InHinM + InMAll);
        int ExMin = MinTotal % 60;
        int TheH = (MinTotal - ExMin) / 60;
        int CeilH = TheH;
        if (ExMin > 0) {
            CeilH = TheH + 1;
        }
        int Price = ((CeilH - 2) * 1000) + 3000;

        if (InHinM < 60) {
            System.out.println("Lama parkir : " + InMAll + " jam");
            System.out.println("Biaya parkir : 3000");
        } else if (InHinM <= 120 && InHinM >= 60) {
            System.out.println("Lama parkir : " + TheH + " jam " + InMAll + " menit");
            System.out.println("Biaya parkir : 3000");
        } else if (InHinM > 120) {
            System.out.println("Lama parkir : " + TheH + " jam " + InMAll + " menit");
            System.out.println("Biaya parkir : " + Price);
        }
    }

}