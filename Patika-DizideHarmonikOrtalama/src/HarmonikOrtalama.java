import java.util.Scanner;

public class HarmonikOrtalama {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Dizinin Uzunluğunu Giriniz: ");

            int length = scanner.nextInt();
            int[] arr = new int[length];
            double harmonikOrtalama, sum = 0;

            for (int i = 0; i < arr.length; i++) {
                System.out.print("Dizinin " + (i + 1) + ". Elemanını Giriniz: ");
                arr[i] = scanner.nextInt();
                sum += 1.0 / arr[i];
            }
            harmonikOrtalama = arr.length / sum;
            System.out.print("Dizideki Elemanların Harmonik Ortalaması: " + harmonikOrtalama);
    }
}
