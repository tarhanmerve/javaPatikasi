import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        int km, yas, tip;
        double tutar, indirim = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden yazınız: ");
        km = input.nextInt();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ): ");
        tip = input.nextInt();

        tutar = km * 0.10;

        if (!(tip == 1 || tip == 2) || (km < 0) || (yas < 0)) {
            System.out.println("Hatalı Veri Girdiniz!");
        } else {
            if (yas < 12) {
                indirim = tutar * 0.5;
            } else if (yas < 24) {
                indirim = tutar * 0.1;
            } else if (yas > 65) {
                indirim = tutar * 0.3;
            }
            tutar = tutar - indirim;

            if (tip == 2) {
                indirim = tutar * 0.2;
                tutar = (tutar - indirim) * 2;
            }
            System.out.println("Toplam Tutar: " + tutar);
        }
    }
}
