import java.util.Scanner;

public class soalsulit2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan jumlah elemen : ");
        int elemen = scanner.nextInt();
        int[] array = new int[elemen];

        System.out.println("Masukkan nilai array : ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        MenemukanDuplicate(array);
    }

    public static void MenemukanDuplicate(int[] array) {
        boolean[] visited = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            if (!visited[i]) {
                int count = 1;
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        visited[j] = true;
                    }
                }
                if (count > 1) {
                    System.out.println("Angka " + array[i] + " memiliki duplikat sebanyak " + count + " kali.");
                }
            }
        }
    }
}