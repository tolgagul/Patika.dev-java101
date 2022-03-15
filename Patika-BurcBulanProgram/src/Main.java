import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;
        Scanner monthInput = new Scanner(System.in);
        System.out.print("Doğduğunuz Ay: ");
        month = monthInput.nextInt();
        Scanner dayInput = new Scanner(System.in);
        System.out.print("Doğduğunuz Gün: ");
        day = dayInput.nextInt();

        if ((month<=0 || month > 12) || (day <= 0 || day > 31 )) {
            System.out.println("Gün veya Ay hatalı girildi. Tekrar deneyiniz.");
        } if (day >20){
            if (month == 1 && day >=22) {
                System.out.println("Burcunuz: Kova");
            } else if (month == 1) {
                System.out.println("Burcunuz: Oğlak");
            } if ((month == 2) && (day<30)) {
                System.out.println("Burcunuz: Balık");
            } else if (month ==2) {
                System.out.println("Burcunuz: Hatalı Giriş");
            } if (month == 3) {
                System.out.println("Burcunuz: Koç");
            } if (month == 4) {
                System.out.println("Burcunuz: Boğa");
            } if ((month == 5) && (day < 22)) {
                System.out.println("Burcunuz: Boğa");
            } if (month == 5) {
                System.out.println("Burcunuz: İkizler");
            } if ((month == 6) && (day < 23)) {
                System.out.println("Burcunuz: İkizler");
            } else if (month == 6) {
                System.out.println("Burcunuz: Yengeç");
            } if ((month == 7) && (day <23)) {
                System.out.println("Burcunuz: Yengeç");
            } else if (month == 7) {
                System.out.println("Burcunuz: Aslan");
            } if ((month == 8) && (day < 23)) {
                System.out.println("Burcunuz: Aslan");
            } else if (month == 8) {
                System.out.println("Burcunuz: Başak");
            } if ((month == 9) && (day <23)) {
                System.out.println("Burcunuz: Başak");
            } else if (month == 9) {
                System.out.println("Burcunuz: Terazi");
            } if ((month == 10) && (day <23)) {
                System.out.println("Burcunuz: Terazi");
            } else if (month == 10) {
                System.out.println("Burcunuz: Akrep");
            } if ((month ==11) && (day < 22)) {
                System.out.println("Burcunuz: Akrep");
            } else if (month == 11) {
                System.out.println("Burcunuz: Yay");
            } if ((month == 12) && (day<22)) {
                System.out.println("Burcunuz: Yay");
            } else if (month == 12) {
                System.out.println("Burcunuz: Oğlak");
            }

        }else {
            if (month == 1) {
                System.out.println("Burcunuz: Oğlak");
            } if (month == 2) {
                System.out.println("Burcunuz: Kova");
            } if (month == 3) {
                System.out.println("Burcunuz: Balık");
            } if (month == 4) {
                System.out.println("Burcunuz: Koç");
            } if (month == 5) {
                System.out.println("Burcunuz: Boğa");
            } if (month == 6) {
                System.out.println("Burcunuz: İkizler");
            } if (month == 7) {
                System.out.println("Burcunuz: Yengeç");
            } if (month == 8) {
                System.out.println("Burcunuz: Aslan");
            } if (month == 9) {
                System.out.println("Burcunuz: Başak");
            } if (month == 10) {
                System.out.println("Burcunuz: Terazi");
            } if (month == 11) {
                System.out.println("Burcunuz: Akrep");
            } if (month == 12) {
                System.out.println("Burcunuz: Yay");
            }
        }
    }
}
