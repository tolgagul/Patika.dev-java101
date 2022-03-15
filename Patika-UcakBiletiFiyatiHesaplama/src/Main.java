import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int age,type,distance;
        double totalAmount = 0, feePerDistance = 0.10;
        boolean error;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafe (KM): ");
        distance = input.nextInt();
        System.out.print("Yaşınız: ");
        age = input.nextInt();
        System.out.println("***********************************");
        System.out.println("1) Tek Yön\n2) Gidiş-Dönüş");
        System.out.print("Yolculuk Tipi(1 veya 2): ");
        type = input.nextInt();
        System.out.println("***********************************");
        error = (distance < 0) || (age < 0) || (type != 1 && type != 2);
        if (!error){
            System.out.println("\n***** Uçuş Bilgileriniz *****");
            System.out.println("Gidilecek Mesafe: " + distance + " KM");
            System.out.println("Yaşınız: " + age);
            System.out.println("Yolculuk Tipi: " + type);
            if (age < 12) {
                switch (type) {
                    case 1 -> totalAmount = (distance * feePerDistance) * 0.5;
                    case 2 -> totalAmount = (((distance * feePerDistance) * 0.5) * 0.8) * 2;
                }
            } else if (age <= 24) {
                switch (type) {
                    case 1 -> totalAmount = (distance * feePerDistance) * 0.9;
                    case 2 -> totalAmount = (((distance * feePerDistance) * 0.9) * 0.8) * 2;
                }
            } else if (age > 25 && age <65) {
                switch (type){
                    case 1 -> totalAmount = (distance * feePerDistance);
                    case 2 -> totalAmount = (((distance * feePerDistance) * 0.9) * 0.8) * 2;
                }
            } else {
                switch (type){
                    case 1 -> totalAmount = (distance * feePerDistance) * 0.7;
                    case 2 -> totalAmount = (((distance * feePerDistance) * 0.7) * 0.8) * 2 ;
                }
            }
            System.out.println("Toplam Tutar: " + totalAmount + " TL");
        }
        else {
            System.out.println("Hatalı Veri Girdiniz !");
        }
    }
}
