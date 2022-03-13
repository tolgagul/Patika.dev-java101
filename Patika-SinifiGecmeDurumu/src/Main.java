import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat,fiz,tur,kim,muz;
        double ort = 0, toplam;
        int sayac = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuz: ");
        mat = input.nextInt();
        if (mat > 0 && mat <= 100) {
            ort = ort + mat;
            sayac++;
        }
        System.out.print("Fizik Notunuz: ");
        fiz = input.nextInt();
        if (fiz > 0 && fiz < 100) {
            ort = ort +fiz;
            sayac++;
        }
        System.out.print("Türkçe Notunuz: ");
        tur = input.nextInt();
        if (tur > 0 && fiz < 100) {
            ort = ort + tur;
            sayac++;
        }
        System.out.print("Kimya Notunuz: ");
        kim = input.nextInt();
        if (kim > 0 && kim < 100) {
            ort = ort + kim;
            sayac++;
        }
        System.out.print("Müzik Notunuz: ");
        muz = input.nextInt();
        if (muz > 0 && muz < 100) {
            ort = ort + muz;
            sayac++;
        }
        toplam = ort / sayac;
        if (toplam >= 55) {
            System.out.println("Tebrikler sınıfı geçtiniz ortalamanız:" + toplam);
        } else {
            System.out.println("Malesef sınıfta kaldınız ortalamanız:" + toplam);
        }
    }
}