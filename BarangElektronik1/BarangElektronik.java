package BarangElektronik1;

public abstract class BarangElektronik {
    public String layar;
    public String tombol;
    public int daya;
    public abstract void nyalakan();

    public BarangElektronik() {
        this.layar = "LCD";
        this.tombol = "Manual";
        this.daya = 10;
    }

    public BarangElektronik(String layar, String tombol, int daya) {
        this.layar = layar;
        this.tombol = tombol;
        this.daya = daya;
    }

    public String getInfo() {
        return "Layar       : " + layar + "\n"
             + "Tombol      : " + tombol + "\n"
             + "Daya        : " + daya + " watt\n";
    }
    
    public void TampilGaransi() {
    }
}
