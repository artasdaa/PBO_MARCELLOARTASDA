package Jobsheet4;
import java.time.LocalDate;

public class SewaIphoneDemo {
    public static void main(String[] args) {

        Barang iphone1 = new Barang(
                1,
                "iPhone 15",
                "128 GB",
                100000,
                "Tersedia"
        );
iphone1.setHargaSewa(1000000);
System.out.println("Harga Sewa Iphone :" +  iphone1.getHargaSewa());
        Pelanggan pelanggan = new Pelanggan(
                1,
                "Marcello Artasda",
                "081234567890",
                "Tulungagung"
        );

        Penyewaan penyewaan1 = new Penyewaan(
                1,
                LocalDate.of(2027, 3, 10),
                LocalDate.of(2027, 3, 15),
                100000,
                "Berlangsung",
                iphone1
        );

        pelanggan.tambahPenyewaan(penyewaan1); //riwayat penyewaan ditambahkan ke pelanggan

        penyewaan1.sewaIphone();

        System.out.println("=================================");
        System.out.println("        DATA PELANGGAN");
        System.out.println("=================================");
        System.out.println(pelanggan.getInfo());

        System.out.println("\n=================================");
        System.out.println("         DATA BARANG");
        System.out.println("=================================");
        System.out.println(iphone1.getInfo());

        System.out.println("\n=================================");
        System.out.println("       PENGEMBALIAN IPHONE");
        System.out.println("=================================");

        penyewaan1.kembalikanIphone();

        System.out.println("\nStatus iPhone setelah dikembalikan: "
        + iphone1.getStatus());
    }
}