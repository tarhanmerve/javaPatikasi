import java.util.Scanner;
public class KullaniciGiris {
    public static void main(String[] args) {
        String userName, password, newPassword, cevap;

        Scanner input = new Scanner(System.in);
        System.out.print("Kullanıcı Adı: ");
        userName = input.nextLine();
        System.out.print("Şifre: ");
        password = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.print("Başarılı Giriş!");
        } else {
            System.out.print("Kullanıcı Adınız veya Şifre Hatalı!");
        }
        if(!password.equals("java123")){
            System.out.print("Şifrenizi sıfırlamak ister misiniz? (E/H): ");
            cevap = input.nextLine();
            if(cevap.equalsIgnoreCase("E")){
                System.out.print("Yeni şifre giriniz: ");
                newPassword = input.nextLine();
                if(newPassword.equals("java123") || newPassword.equals(password)){
                    System.out.print("Şifre oluşturulamadı, lütfen başka bir şifre giriniz.");
                }else{
                    System.out.print("Şifre oluşturuldu.");
                }
            }
        }
    }
}