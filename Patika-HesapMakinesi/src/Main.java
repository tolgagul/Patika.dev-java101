import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, select;
        Scanner input = new Scanner(System.in);
        System.out.print("İlk Sayıyı Giriniz: " );
        number1 = input.nextInt();
        System.out.print("İkinci Sayısı Giriniz: ");
        number2 = input.nextInt();
        System.out.println("1) Toplama\n2) Çıkarma\n3) Çarpma\n4) Bölme");
        System.out.print("Seçim Yapınız: ");
        select = input.nextInt();

        switch (select) {
            case 1 -> {
                System.out.println("Toplama işlemi yapılıyor...");
                System.out.print("Sonuç: " + (number1 + number2));
            }
            case 2 -> {
                System.out.println("Çıkarma işlemi yapılıyor...");
                System.out.print("Sonuç: " + (number1 - number2));
            }
            case 3 -> {
                System.out.println("Çarpma işlemi yapılıyor...");
                System.out.print("Sonuç: " + (number1 * number2));
            }
            case 4 -> {
                if (number2 == 0) {
                    System.out.println("Bir sayı 0'a bölünemez.");
                } else
                    System.out.println("Bölme işlemi yapılıyor...");
                System.out.print("Sonuç: " + (number1 / number2));
            }
            default -> System.out.println("Hatalı İşlem...\nTekrar Deneyiniz.");
        }
    }
}
