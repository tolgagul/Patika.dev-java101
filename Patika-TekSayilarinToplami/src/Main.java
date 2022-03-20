import java.util.Scanner;
/*
Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
 */
public class Main {
    public static void main(String[] args) {
        int num;
        int total = 0;
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Bir Sayı Giriniz: ");
            num = input.nextInt();
            if (num %4 == 0) {
                total += num;
            }
        } while (num %2 == 0);
        System.out.println("Sonuç: " + total);
    }
}
