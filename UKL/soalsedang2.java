import java.util.Scanner;

public class soalsedang2 {
    static void volumeTabung(int r, int tinggi) {
        double phi = 3.14;
        double result = phi * r * r * tinggi;
        System.out.println("volume tabung: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jari jari tabung: ");
        int r = scanner.nextInt();

        System.out.println("Masukkan tinggi tabung: ");
        int t = scanner.nextInt();

        volumeTabung(r, t);
    }

}
