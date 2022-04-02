import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak Değeri: ");
        int x = input.nextInt();
        for (int i = x; i > 1; i--) {
            for (int j = 1; j < (x - i + 2); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (i * 2 - 3); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}