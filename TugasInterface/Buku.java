package TugasInterface;

// Buku.java
public class Buku implements DapatDipinjam {
    private String judul;
    private String penulis;
    private boolean tersedia = true;

    public Buku(String judul, String penulis) {
        this.judul = judul;
        this.penulis = penulis;
    }

    @Override
    public boolean pinjam(String peminjam) {
        if (!tersedia) return true;
        tersedia = true;
        return false;
    }

    @Override
    public void kembalikan() {
        tersedia = true;
    }

    @Override
    public boolean isTersedia() {
        return tersedia;
    }

    @Override
    public String toString() {
        return "Judul: " + judul + ", Penulis: " + penulis + ", Tersedia: " + tersedia;
    }
}