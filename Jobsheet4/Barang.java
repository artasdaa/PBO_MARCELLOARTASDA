package Jobsheet4;

public class Barang { //atribut
    private int idIphone;
    private String tipe;
    private String kapasitas;
    private double hargaSewa;
    private String status;

    //constructor memberikan nilai awal
    public Barang(int idIphone, String tipe, String kapasitas, double hargaSewa, String status) {
        this.idIphone = idIphone;
        this.tipe = tipe;
        this.kapasitas = kapasitas;
        this.hargaSewa = hargaSewa;
        this.status = status;
    }

    //getter
    public int getIdIphone() {
        return idIphone;
    }

    //setter
    public void setIdIphone(int idIphone) {
        this.idIphone = idIphone;
    }

    public String getTipe() {
        return tipe;
    }

    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public String getKapasitas() {
        return kapasitas;
    }

    public void setKapasitas(String kapasitas) {
        this.kapasitas = kapasitas;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean cekKetersediaan() {
        return status.equalsIgnoreCase("Tersedia");
    }

    //Menggabungkan seluruh informasi menjadi 1 string
    public String getInfo() {
        return "ID iPhone: " + idIphone +
                "\nTipe: " + tipe +
                "\nKapasitas: " + kapasitas +
                "\nHarga Sewa: Rp" + hargaSewa +
                "\nStatus: " + status;
    }
}