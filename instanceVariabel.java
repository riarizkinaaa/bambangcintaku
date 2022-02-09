/*instance variabel yang di deklarasikan di class, variabel ini
tidak perlu harus menentukan nilai bawaannya contoh*/
public class instanceVariabel {
    // Deklarasi instance variabel
    String name;
    int dayaTahan;

    public void setinput(String setnama, int setdayaTahan) {
        name = setnama;
        dayaTahan = setdayaTahan;

    }

    public void getinput() {
        System.out.println("nama: " + name);
        System.out.println("daya tahan: " + dayaTahan);
    }

    public static void main(String[] args) {
        instanceVariabel input = new instanceVariabel();
        input.setinput("ria", 100);
        input.getinput();

    }

}
