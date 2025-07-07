import java.util.Scanner;

public class harmonikSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Harmonik seri toplamı bulmak icin n sayısını girin: ");
        int number = scanner.nextInt();
        double toplam = 0.0;

        for(int i = 1; i <= number; i++) {
            toplam += 1.0/i;
        }

        System.out.println("Girilen sayının harmonik seri toplami: " + toplam );

    }
}
