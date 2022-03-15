import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b,c;
        Scanner numberInput = new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz: ");
        a = numberInput.nextInt();
        System.out.print("2. Sayıyı Giriniz: ");
        b = numberInput.nextInt();
        System.out.print("3. Sayıyı Giriniz: ");
        c = numberInput.nextInt();

        if ((a < b) && (a < c)) {
            if (b < c) {
                System.out.println(a + " < " + b  + " < " + c + " Şeklinde küçükten büyüğe sıralanmıştır.");
            } else {
                System.out.println(a + " < " + c  + " < " + b + " Şeklinde küçükten büyüğe sıralanmıştır.");
            }
        } else if ((b < a) && (b < c)) {
            if (a < c) {
                System.out.println(b + " < " + a  + " < " + c + " Şeklinde küçükten büyüğe sıralanmıştır.");
            }else {
                System.out.println(b + " < " + c  + " < " + a + " Şeklinde küçükten büyüğe sıralanmıştır.");
            }
        } else {
            if (a < b) {
                System.out.println(c + " < " + a  + " < " + b + " Şeklinde küçükten büyüğe sıralanmıştır.");
            } else  {
                System.out.println(c + " < " + b  + " < " + b + " Şeklinde küçükten büyüğe sıralanmıştır.");
            }
        }
    }
}
