import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        int number = input.nextInt();
        int total = 0;

        while(number != 0) {
            int digit = number %10;
            number = number / 10;
            total += digit;
        }
        System.out.println("Rakamlar Toplamı: " + total);
    }
}