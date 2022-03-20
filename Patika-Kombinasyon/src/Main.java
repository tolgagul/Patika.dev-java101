import java.util.Scanner;

/*
N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

Java ile kombinasyon hesaplayan program yazınız.

Kombinasyon formülü
C(n,r) = n! / (r! * (n-r)!)
 */

public class Main {
    public static void main(String[] args) {
        int n, r;
        int faktoriyeln = 1, faktoriyelr = 1, faktoriyelj = 1;
        Scanner input = new Scanner(System.in);

        System.out.print("1. kümenin elemanları: ");
        n = input.nextInt();
        for (int i = 1; i <= n; i++) {
            faktoriyeln *= i;
        }

        System.out.print("2. kümenin elemanları: ");
        r = input.nextInt();
        for (int k = 1; k <= r; k++){
            faktoriyelr *= k;
        }

        for (int j = 1; j <= (n-r); j++) {
            faktoriyelj *= j;
        }

        int result = (faktoriyeln) / (faktoriyelr * faktoriyelj);
        System.out.println("C(" + (n) + "," + (r) + ")" + ":" + result);
    }
}