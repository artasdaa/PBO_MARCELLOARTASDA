package BarangElektronik1;

public class MainDemo {
    public static void main(String[] args) {

        Radio radio1 = new Radio(
            "LCD",
            "Digital",
            15
        );

        Kamera kamera1 = new Kamera(
            "OLED",
            "Digital",
            20
        );

        System.out.println(radio1.getInfo());
        radio1.gantiSuara();
        radio1.aturVolume();
        radio1.nyalakan();

        System.out.println();

        System.out.println(kamera1.getInfo());
        kamera1.memotret();
        kamera1.aturISO();
        kamera1.nyalakan();

    }
}
