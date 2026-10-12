package Jobsheet4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Penyewaan {
    private int idPenyewaan;
    private LocalDate tanggalSewa;
    private LocalDate tanggalKembali;
    private double totalHarga;
    private String status;
    private Barang barang;

    public Penyewaan(int idPenyewaan, LocalDate tanggalSewa, LocalDate tanggalKembali, double totalHarga, String status, Barang barang) {
        this.idPenyewaan = idPenyewaan;
        this.tanggalSewa = tanggalSewa;
        this.tanggalKembali = tanggalKembali;
        this.totalHarga = totalHarga;
        this.status = status;
        this.barang = barang;
    }

    public int getIdPenyewaan() {
        return idPenyewaan;
    }

    public void setIdPenyewaan(int idPenyewaan) {
        this.idPenyewaan = idPenyewaan;
    }

    public LocalDate getTanggalSewa() {
        return tanggalSewa;
    }

    public void setTanggalSewa(LocalDate tanggalSewa) {
        this.tanggalSewa = tanggalSewa;
    }

    public LocalDate getTanggalKembali() {
        return tanggalKembali;
    }

    public void setTanggalKembali(LocalDate tanggalKembali) {
        this.tanggalKembali = tanggalKembali;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(double totalHarga) {
        this.totalHarga = totalHarga;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Barang getBarang() {
        return barang;
    }

    public void setBarang(Barang barang) {
        this.barang = barang;
    }

    public void sewaIphone() {
        if (barang.cekKetersediaan()) {
            barang.setStatus("Disewa");
            status = "Berlangsung";
            System.out.println("iPhone berhasil disewa.");
        } else {
            System.out.println("iPhone sedang tidak tersedia.");
        }
    }

    public void kembalikanIphone() {
        barang.setStatus("Tersedia");
        status = "Selesai";
        System.out.println("iPhone berhasil dikembalikan.");
    }

    public double hitungTotal() {
        return totalHarga;
    }

    public String getInfo() {
        DateTimeFormatter formatTanggal = DateTimeFormatter.ofPattern("d MMMM yyyy");

        return "ID Penyewaan: " + idPenyewaan +
                "\nTanggal Sewa: " + tanggalSewa.format(formatTanggal) +
                "\nTanggal Kembali: " + tanggalKembali.format(formatTanggal) +
                "\nTotal Harga: Rp" + totalHarga +
                "\nStatus: " + status +
                "\nBarang: " + barang.getTipe();
    }
}