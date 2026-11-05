package TugasInterface;

public interface DapatDipinjam {
    boolean pinjam(String peminjam);
    void kembalikan();
    boolean isTersedia();
}