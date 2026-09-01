package Jobsheet2;

public class DragonMain {
    public static void main(String[] args) {

        Dragon dragon1 = new Dragon();
        Dragon dragon2 = new Dragon();

        System.out.println("=== KONDISI AWAL ===");
        dragon1.printStatus();
        dragon2.printStatus();

        dragon1.move(5);

        dragon2.changeDirection(2);
        dragon2.move(3);

        System.out.println("=== SETELAH BERGERAK ===");
        dragon1.printStatus();
        dragon2.printStatus();

        dragon1.changeDirection(2);
        dragon1.move(2);

        dragon2.changeDirection(3);
        dragon2.move(4);

        System.out.println("=== SETELAH PERUBAHAN KEDUA ===");
        dragon1.printStatus();
        dragon2.printStatus();

        dragon1.changeDirection(4);
        dragon1.move(3);

        System.out.println("=== SETELAH BERGERAK KE KIRI ===");
        dragon1.printStatus();
    }
}