import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yearOfBirth;
        Scanner input = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        yearOfBirth = input.nextInt();

        if (yearOfBirth < 0) {
            System.out.println("0'dan büyük değer giriniz.");
        }
        if (yearOfBirth == 0) {
            System.out.println("Çin Zodyağı Burcunuz: Maymun");
        } else if (yearOfBirth %12 == 1) {
            System.out.println("Çin Zodyağı Burcunuz: Horoz");
        } else if (yearOfBirth %12 == 2) {
            System.out.println("Çin Zodyağı Burcunuz: Köpek");
        } else if (yearOfBirth %12 == 3) {
            System.out.println("Çin Zodyağı Burcunuz: Domuz");
        } else if (yearOfBirth %12 == 4) {
            System.out.println("Çin Zodyağı Burcunuz: Fare");
        } else if (yearOfBirth %12 == 5) {
            System.out.println("Çin Zodyağı Burcunuz: Öküz");
        } else if (yearOfBirth %12 == 6) {
            System.out.println("Çin Zodyağı Burcunuz: Kaplan");
        } else if (yearOfBirth %12 == 7) {
            System.out.println("Çin Zodyağı Burcunuz: Tavşan");
        } else if (yearOfBirth %12 == 8) {
            System.out.println("Çin Zodyağı Burcunuz: Ejderha");
        } else if (yearOfBirth %12 == 9) {
            System.out.println("Çin Zodyağı Burcunuz: Yılan");
        } else if (yearOfBirth %12 == 10) {
            System.out.println("Çin Zodyağı Burcunuz: At");
        } else if (yearOfBirth %12 == 11) {
            System.out.println("Çin Zodyağı Burcunuz: Koyun");
        }
    }
}