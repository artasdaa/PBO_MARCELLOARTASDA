package Jobsheet4;
import java.util.ArrayList;

public class Pelanggan {
    private int idPelanggan;
    private String nama;
    private String noTelepon;
    private String alamat;
    private ArrayList<Penyewaan> riwayatPenyewaan;

    //constructor
    public Pelanggan(int idPelanggan, String nama, String noTelepon, String alamat) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;
        this.riwayatPenyewaan = new ArrayList<>();
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public ArrayList<Penyewaan> getRiwayatPenyewaan() {
        return riwayatPenyewaan;
    }

    public void setRiwayatPenyewaan(ArrayList<Penyewaan> riwayatPenyewaan) {
        this.riwayatPenyewaan = riwayatPenyewaan;
    }

    public void tambahPenyewaan(Penyewaan penyewaan) {
        riwayatPenyewaan.add(penyewaan);
    }

    public String getInfo() {
        String info = "ID Pelanggan: " + idPelanggan +
                "\nNama: " + nama +
                "\nNo Telepon: " + noTelepon +
                "\nAlamat: " + alamat;

        if (!riwayatPenyewaan.isEmpty()) {
            info += "\n\nRiwayat Penyewaan:";

            //enchanced for loop untuk menampilkan seluruh riwayat penyewaan
            for (Penyewaan penyewaan : riwayatPenyewaan) {
                info += "\n\n" + penyewaan.getInfo();
            }
        }

        return info;
    }
}