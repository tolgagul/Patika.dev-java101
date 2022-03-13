import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armut=2.14,
                elma=3.67,
                domates=1.11,
                muz=0.95,
                patlican=5.0,
                tutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Kaç Kilo Armut Aldınız?: ");
        armut *= input.nextInt();
        System.out.print("Kaç Kilo Elma Aldınız?: ");
        elma *= input.nextInt();
        System.out.print("Kaç Kilo Domates Aldınız?: ");
        domates *= input.nextInt();
        System.out.print("Kaç Kilo Muz Aldınız?: ");
        muz *= input.nextInt();
        System.out.print("Kaç Kilo Patlıcan Aldınız?: ");
        patlican *= input.nextInt();

        tutar = armut+elma+domates+muz+patlican;
        System.out.println("Toplam Tutar: " + tutar + " ₺");
    }
}