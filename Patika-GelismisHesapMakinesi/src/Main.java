import java.util.Scanner;

public class Main {
    // Toplama
    static void plus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int counter = scan.nextInt();
        int number, result = 0;
        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result += number;
                continue;
            }
            result += number;
        }
        System.out.println("Sonuç: " + result);
    }
    // Çıkarma
    static void minus() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int counter = scan.nextInt();
        int number, result = 0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result -= number;
                continue;
            }
            result -= number;
        }

        System.out.println("Sonuç: " + result);
    }
    // Çarpma
    static void times() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int counter = scan.nextInt();
        int number, result = 1;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextInt();
            if (i == 1) {
                result *= number;
                continue;
            }
            result *=number;
        }

        System.out.println("Sonuç: " + result);
    }
    // Bölme
    static void divided() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç sayı gireceksiniz?: ");
        int counter = scan.nextInt();
        double number, result = 0.0;

        for (int i = 1; i <= counter; i++) {
            System.out.print(i + ". sayı: ");
            number = scan.nextDouble();
            if (i != 1 && number == 0) {
                System.out.println("Bölen 0 giremezsiniz.");
                continue;
            }
            if (i == 1) {
                result = number;
                continue;
            }
            result /= number;
        }

        System.out.println("Result : " + result);
    }
    // Üslü Sayı Hesaplama
    static void power() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int base = scan.nextInt();
        System.out.print("Üs giriniz: ");
        int exponent = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result *= base;
        }

        System.out.println("Sonuç: " + result);
    }
    // Faktoriyel Hesaplama
    static void factorial() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int n = scan.nextInt();
        int result = 1;

        for (int i = 1; i <= n; i++) {
            result *= i;
        }

        System.out.println("Sonuç: " + result);
    }
    // Mod alma
    static void mod() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int num = scan.nextInt();
        System.out.print("Lütfen mod değeri giriniz: ");
        int mod = scan.nextInt();
        System.out.println("Sonuç: " + num % mod);
    }
    // Dikdörtgen Alan-Çevre Hesabı
    static void areaprimeter() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Uzun Kenar: ");
        int longSide = scan.nextInt();
        System.out.print("Kısa Kenar: ");
        int shortSide = scan.nextInt();
        System.out.println("Dikdörtgen Alanı: " + longSide * shortSide);
        System.out.println("Dikdörtgen Çevresi: "+(longSide * shortSide) * 2);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;
        String menu =
                "1- Toplama İşlemi\n"
                        + "2- Çıkarma İşlemi\n"
                        + "3- Çarpma İşlemi\n"
                        + "4- Bölme İşlemi\n"
                        + "5- Üslü Sayı Hesaplama\n"
                        + "6- Faktoriyel Hesaplama\n"
                        + "7- Mod Alma\n"
                        + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                        + "0- Çıkış";

        do {
            System.out.println(" - İşlem Menüsü - ");
            System.out.println(menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            select = scan.nextInt();
            switch (select) {
                case 1:
                    plus();
                    break;
                case 2:
                    minus();
                    break;
                case 3:
                    times();
                    break;
                case 4:
                    divided();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    areaprimeter();
                    break;
                case 0:
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyin.");
            }
        } while (select != 0);
    }
}
