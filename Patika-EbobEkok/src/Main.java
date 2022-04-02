import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Birinci Sayıyı Giriniz: ");
        int n1 = input.nextInt();
        System.out.print("İkinci Sayıyı Giriniz: ");
        int n2 = input.nextInt();
        int i = n1;
        int ebob = 1;
        int ekok = 1;

        while (i > 1) {
            if (n1%i == 0 && n2%i == 0) {
                ebob = i;
                ekok = (n1 * n2) / ebob;
                break;
            }
            i--;
        }
        System.out.println("EBOB: " + ebob);
        System.out.print("EKOK: " + ekok);
    }
}
