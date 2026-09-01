package Tugas;

public class Dragon {
    private int x;
    private int y;
    private int direction;

    // Constructor
    public Dragon() {
        x = 0;
        y = 0;
        direction = 1; //arah awal = Atas
    }

    // Mengubah arah
    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid!");
        }
    }

    // Menggerakkan Dragon
    public void move(int steps) {
        if (direction == 1) {
            y += steps; // Atas
        } else if (direction == 2) {
            x += steps; // Kanan
        } else if (direction == 3) {
            y -= steps; // Bawah
        } else if (direction == 4) {
            x -= steps; // Kiri
        }
    }

    // Menampilkan status Dragon
    public void printStatus() {
        String arah;

        if (direction == 1) {
            arah = "Atas";
        } else if (direction == 2) {
            arah = "Kanan";
        } else if (direction == 3) {
            arah = "Bawah";
        } else {
            arah = "Kiri";
        }

        System.out.println("Posisi Dragon: (" + x + ", " + y + ")");
        System.out.println("Arah: " + arah);
        System.out.println();
    }
}