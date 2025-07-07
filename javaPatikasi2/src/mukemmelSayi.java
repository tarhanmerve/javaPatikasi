import java.util.Scanner;

public class mukemmelSayi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz:");
        int sayi = scanner.nextInt();

        if(sayi <=0){
            System.out.print("Pozitif bir sayı giriniz!");
            return ;
        }

        int toplam = 0;

        for(int i = 1; i < sayi; i++) {
            if(sayi%i == 0) {
                toplam += i;
            }
        }

        if(toplam == sayi) {
            System.out.println(sayi + " sayisi mükemmel sayidir.");
        }
        else {
            System.out.println(sayi + " sayisi mükemmel sayi degildir.");
        }
    }
}
