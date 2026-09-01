package Jobsheet2;

public class Dragon {
    private int x;
    private int y;
    private int direction;

    public Dragon() {
        x = 0;
        y = 0;
        direction = 1;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah tidak valid!");
        }
    }

    public void move(int steps) {
        if (direction == 1) {
            y += steps;
        } else if (direction == 2) {
            x += steps;
        } else if (direction == 3) {
            y -= steps;
        } else if (direction == 4) {
            x -= steps;
        }
    }

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