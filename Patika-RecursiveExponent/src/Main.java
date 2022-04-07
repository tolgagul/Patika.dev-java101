import java.util.Scanner;

public class Main {
    static int exponent(int base, int exponent){
        if(exponent == 0)
            return 1;
        int result = 1;
        result *= exponent(base, exponent-1) * base;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int base, exponent;
        System.out.print("Taban değeri giriniz: ");
        base = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        exponent = input.nextInt();
        System.out.println("Sonuç: " + exponent(base,exponent));
    }
}