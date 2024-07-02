import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String userName, password, userName2, password2;
        userName2 = "admin";
        password2 = "123";
        Scanner sc = new Scanner(System.in);

        System.out.print("Kullanıcı adınız: ");
        userName = sc.nextLine();

        System.out.print("Şifrenizi giriniz: ");
        password = sc.nextLine();

        if (userName.equals(userName2) && password.equals(password2)){
            System.out.println("Giriş başarılı.");

        }
        else {
            System.out.println("Kullanıcı adı veya şifre yanlış\nŞifrenizi sıfırlamak ister misiniz?\n1)Evet\n2)Hayır");
            int secim = sc.nextInt();
            switch (secim) {
                case 1:
                    System.out.print("Yeni şifrenizi giriniz:");
                    password2 = sc.nextLine();
                    break;
                case 2:
                    System.out.println("Şifre değiştirilmedi. Giriş başarısız.");
                    break;
            }
        }
    }
}