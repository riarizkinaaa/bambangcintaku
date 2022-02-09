// contoh variabel local
/* yang dapat di gunakan di method atau fungsi,
* variabel ini tidak mempunyai nilai bawaan,sehingga kita harus memnentukan
* valuenya contoh;
*/
public class variabellocal {

    public static void local() {
        String nama = "ria rizkina";// <--kita harus menentukan valuenya seperti ini
        System.out.println("nama: " + nama);

    }

    public static void belajar() {
        String hobi = "rebahan,main hp,menghayal";
        System.out.println("hobi ku: " + hobi);
    }

    public static void menghitungumur() {
        int tahun = 2001;
        int tahunSekarang = 2022;
        int hasil = tahunSekarang - tahun;
        System.out.println("umur anda: " + hasil);
    }

    public static void main(String[] args) {
        variabellocal input = new variabellocal();
        input.local();// <-- local() adalah nama dari methodnya

        input.belajar();
        input.menghitungumur(); // <--cara memanggilnya di main

    }

}
