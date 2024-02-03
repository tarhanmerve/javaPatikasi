import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km,total,perKm=2.20,startPrice=10;

        Scanner input = new Scanner(System.in);
        System.out.print("Kaç kilometre yol gideceğinizi giriniz: ");
        km = input.nextDouble();

        total = startPrice + (km*perKm);
        total = (total<=20) ? 20: total;
        System.out.println("Toplam tutar: "+total);
    }
}
