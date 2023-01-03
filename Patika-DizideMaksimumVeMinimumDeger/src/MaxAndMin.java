import java.util.Scanner;

public class MaxAndMin {
    public static void main(String[] args) {
        int number[] = {15, 12, 788, 1, -1, -778, 2, 0}, sayi, upNearFark = 99999, downNearFark = -99999, upNear = 99999, downNear = 99999;
        Scanner sc = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        sayi = sc.nextInt();

        for (int i : number) {
            if (sayi - i > 0) {
                if (sayi - i < upNearFark) {
                    upNear = i;
                    upNearFark = sayi - i;
                }
            } else if (sayi - i < 0) {
                if (sayi - i > downNearFark) {
                    downNear = i;
                    downNearFark = sayi - i;
                }

            } else {
                upNear = sayi;
                downNear = sayi;
                break;
            }
        }
        System.out.println("Girilen Sayıdan Küçük En Yakın Sayı:" + upNear
                + "\nGirilen Sayıdan Büyük En Yakın Sayı:" + downNear);
    }
}