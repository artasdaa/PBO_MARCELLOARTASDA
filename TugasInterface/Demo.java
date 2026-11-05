package TugasInterface;

public class Demo {
    public static void main(String[] args) {
        DapatDipinjam[] daftar = {
            new Buku("Pemrograman Java", "Marcell"),
            new Laptop("Lenovo")
        };

        for (DapatDipinjam item : daftar) {
            item.pinjam("Farrell");
            System.out.println(item);
        }
    }
}