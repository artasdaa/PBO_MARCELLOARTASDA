package BarangElektronik1;

public class Kamera extends BarangElektronik {

    public Kamera() {
        super();
    }

    public Kamera(String layar, String tombol, int daya) {
        super(layar, tombol, daya);
    }

    public String getInfo() {
        return "=== INFORMASI KAMERA ===\n"
             + super.getInfo()
             + "Jenis       : Kamera\n";
    }

    public void memotret() {
        System.out.println("Kamera mengambil foto.");
    }

    public void aturISO() {
        System.out.println("Mengatur ISO kamera.");
    }
    
    @Override
    public void nyalakan() {
        System.out.println("Garansi Kamera dinyalakan.");
    }
}