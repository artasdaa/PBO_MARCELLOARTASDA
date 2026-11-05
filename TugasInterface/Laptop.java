package TugasInterface;

// Laptop.java
public class Laptop implements DapatDipinjam {
    private String merk;
    private boolean tersedia = true;
    private String peminjam;

    public Laptop(String merk) {
        this.merk = merk;
    }

    @Override
    public boolean pinjam(String peminjam) {
        if (!tersedia) return false;
        tersedia = false;
        this.peminjam = peminjam;
        return true;
    }

    @Override
    public void kembalikan() {
        tersedia = true;
        peminjam = null;
    }

    @Override
    public boolean isTersedia() {
        return tersedia;
    }

    @Override
    public String toString() {
        return "Merk: " + merk + ", Tersedia: " + tersedia
            + ", Peminjam: " + (peminjam == null ? "-" : peminjam);
    }
}