import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç tane sayı gireceksiniz: ");
        int n = input.nextInt();
        int max = 0;
        int min = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print(i + ". Sayıyı giriniz: ");
            int k = input.nextInt();

            if (k > max) {
                if (min == 0) {
                    min = k;
                }
                max = k;
            }
            if (k < min) {
                if (max == 0) {
                    max = k;
                }
                min = k;
            }
        }
        System.out.println("En Büyük Sayı: " + max);
        System.out.println("En Küçük Sayı: " + min);
    }
}
