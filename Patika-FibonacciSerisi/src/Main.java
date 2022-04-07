import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Eleman Sayısı Giriniz: ");
        int num = input.nextInt();
        int total, num1 = 0, num2 = 1;

        for (int i = 0; i < num; i++) {
            total = num1 + num2;

            System.out.println(num1 + " + " + num2 + " = " + total);
            num1 = num2;
            num2 = total;
        }
    }
}
