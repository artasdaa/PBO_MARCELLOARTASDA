package BarangElektronik;

public class Radio extends BarangElektronik {

    public Radio() {
        super();
    }

    public Radio(String layar, String tombol, int daya) {
        super(layar, tombol, daya);
    }

    @Override
    public String getInfo() {
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
}
