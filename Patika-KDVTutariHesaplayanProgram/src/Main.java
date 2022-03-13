import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar, kdvOraniOnsekiz, kdvOraniSekiz;
        kdvOraniOnsekiz = 0.18;
        kdvOraniSekiz = 0.08;
        Scanner input = new Scanner(System.in);

        System.out.print("Tutar Giriniz: ");
        tutar = input.nextDouble();
        System.out.println("Ürün Tutarı: " + tutar + "₺");

        double kdvOrani, kdvliFiyat;
        kdvOrani = (tutar <= 1000) ? kdvOraniOnsekiz : kdvOraniSekiz;
        kdvliFiyat = tutar + (tutar * kdvOrani);
        System.out.println("KDV'li fiyat= " + kdvliFiyat + "₺");

        double kdvTutari = kdvliFiyat - tutar;
        System.out.println("KDV tutarı = " +kdvTutari + "₺");
    }
}
