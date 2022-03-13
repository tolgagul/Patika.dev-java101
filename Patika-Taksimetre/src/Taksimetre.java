/*
    Taksimetre KM başına 2.20 TL tutmaktadır.
    Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
    Taksimetre açılış ücreti 10 TL'dir.
 */

import java.util.Scanner;

public class Taksimetre {
    public static void main(String[] args) {
        double taksimetreKM = 2.2, acilisTutari = 10, odenecekTutar;
        int km;

        Scanner scan = new Scanner(System.in);
        System.out.print("Gidilen Mesafe (KM Cinsinden Giriniz): ");
        km = scan.nextInt();

        odenecekTutar = (km * taksimetreKM);
        odenecekTutar += acilisTutari;
        odenecekTutar = (odenecekTutar < 20) ? 20 : odenecekTutar;

        System.out.println("Ödenmesi Gereken Tutar: " + odenecekTutar + " ₺");
    }
}
