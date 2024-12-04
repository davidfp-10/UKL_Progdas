import java.util.Scanner;

public class soal2mudah {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka awal : ");
        int angka1 = input.nextInt();

        System.out.println("Masukkan angka akhir: ");
        int angka2 = input.nextInt();

        for (int i = angka1; i <= angka2; i++) {

            if (i % 2 == 0) {
                System.out.println(i + " adalah Bilangan Genap");
            } else {
                System.out.println(i + " adalah Bilangan Ganjil");
            }
        }
    }
}