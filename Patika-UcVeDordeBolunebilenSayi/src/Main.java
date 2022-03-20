import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int k;
        int sum = 0, count = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        k = input.nextInt();
        if (k <= 0) {
            System.out.println("Sıfırdan büyük bir değer giriniz.");
            System.exit(0);
        } else {
            for (int i = 1; i <= k; i++){
                if ((i %3 == 0) && (i %4 == 0)) {
                    sum += i;
                    count++;
                }
            }
        }
        int average = sum / count;
        System.out.println(k + " Sayısının 3 ve 4'e Tam Bölünen Sayılarının Ortalaması: " + average );
    }
}
