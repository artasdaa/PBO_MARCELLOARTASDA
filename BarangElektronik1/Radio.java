package BarangElektronik1;

public class Radio extends BarangElektronik {

    public Radio() {
        super();
    }

    public Radio(String layar, String tombol, int daya) {
        super(layar, tombol, daya);
    }
    
    public String getInfo() {
        System.out.println(this.layar);
        return "=== INFORMASI RADIO ===\n"
             + super.getInfo()
             + "Jenis       : Radio\n";
    }

    public void gantiSuara() {
        System.out.println("Mengganti saluran radio.");
    }

    public void aturVolume() {
        System.out.println("Mengatur volume radio.");
    }

    @Override
    public void nyalakan() {
        System.out.println("Garansi Radio dinyalakan.");
    }
}