import java.util.Scanner;

public class armstrongSayilar {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        int geciciSayi = sayi;
        int basamak = 0;
        int toplam = 0;

        while(geciciSayi != 0){
            basamak = geciciSayi % 10;
            toplam += basamak;
            geciciSayi = geciciSayi / 10;
        }

            System.out.println(sayi + " sayisinin basamak degerlerinin toplamı: " + toplam);
    }


}
