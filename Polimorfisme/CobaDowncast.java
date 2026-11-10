public class CobaDowncast {
    public static void main(String[] args) {
        Pegawai pegawai = new Pegawai("111", "Budi");
        Dosen dosen = (Dosen) pegawai;
        System.out.println(dosen.nidn);
    }
}