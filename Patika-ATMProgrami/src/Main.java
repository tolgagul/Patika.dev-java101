import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int select;
        int balance = 1500, price;
        int right = 3;

        while (right > 0) {
            System.out.print("Kullanıcı Adınız : ");
            userName = input.nextLine();
            System.out.print("Parolanız : ");
            password = input.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Merhaba, Kodluyoruz Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("""
                            1-Para Yatırma
                            2-Para Çekme
                            3-Bakiye Sorgulama
                            4-Çıkış Yap""");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para Miktarı : ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para Miktarı : ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("Bakiye Yetersiz !");
                            } else {
                                balance -= price;
                                break;
                            }
                        case 3:
                            System.out.println("Bakiyeniz : " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Tekrar Görüşmek Üzere . ");
                break;
            } else {
                right--;
                System.out.println("Hatalı Kullanıcı Adı veya Şifre . Tekrar Deneyiniz.");
                if (right == 0) {
                    System.out.println("Hesabınız Bloke olmuştur lüften banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Kalan Hakkınız : " + right);
                }
            }
        }
    }
}