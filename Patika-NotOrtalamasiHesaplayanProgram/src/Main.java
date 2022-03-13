import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        double sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik Notunuzu Giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuzu Giriniz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz: ");
        muzik = input.nextInt();

        sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6.0;
        System.out.println("Ortalamanız : " + sonuc);
        System.out.println(sonuc > 60 ? "Sınıfı Geçti" : "Sınıfta Kaldı");
    }
}
