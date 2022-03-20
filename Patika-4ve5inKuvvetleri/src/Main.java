import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sınır Değeri Giriniz: ");
        num = input.nextInt();

        System.out.println("4'ün Kuvvetleri");
        for (int i = 1; i <= num; i *= 4) {
            System.out.print(i + ",");
        }
        System.out.println(" ");
        System.out.println("5'in Kuvvetleri");
        for (int i = 1; i <= num; i *= 5) {
            System.out.print(i + ",");
        }
    }
}


