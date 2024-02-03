import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double kgArmut, kgElma, kgDomates, kgMuz, kgPatlican;
        double armutFiyat=2.14, elmaFiyat=3.67, domatesFiyat=1.11, muzFiyat= 0.95, patlicanFiyat=5.0;
        double total;

        Scanner input = new Scanner(System.in);
        System.out.print("Armut Kaç Kilo ? : ");
        kgArmut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        kgElma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        kgDomates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        kgMuz = input.nextDouble();
        System.out.print("Patlıcan Kaç Kilo ? : ");
        kgPatlican = input.nextDouble();

        total = (kgArmut*armutFiyat) + (kgElma*elmaFiyat) + (kgDomates*domatesFiyat) +
                (kgMuz*muzFiyat) + (kgPatlican*patlicanFiyat);
        System.out.println("Toplam Tutar: "+total);
    }
}
