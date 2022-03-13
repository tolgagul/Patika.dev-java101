import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, password;
        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();
        System.out.print("Parola: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Kullanıcı Girişi Başarılı");
        } else if (!userName.equals("patika") && password.equals("java123")) {
            System.out.println("Kullanıcı Adı Hatalı");
        } else {
            System.out.println("Parola Hatalı");
            System.out.println("Şifrenizi sıfırlamak ister misiniz ?\n1) Evet.\n2) Hayır.");
            System.out.print("Parola Değişiikliği: "); }
            int passwordReset;
            passwordReset = input.nextInt();
        switch (passwordReset) {
            case 1 -> {
                System.out.print("Yeni Şifre: " + input.nextLine());
                String newPassword = input.nextLine();
                if (newPassword.equals("java123")) {
                    System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
                } else {
                    System.out.println("Şifre oluşturuldu");
                }
            }
            case 2 -> System.out.println("Parola değiştirilmedi.");
        }
        }
    }
