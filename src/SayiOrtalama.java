import java.util.Scanner;
public class SayiOrtalama {
    public static void main(String[] args) {
        int i,sayi,total=0,sayac=0,ort;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        sayi = scanner.nextInt();

        for(i=1; i<sayi; i++){
            if((i%3==0) && (i%4==0)){
                System.out.println(i);
                sayac++;
                total +=i;
            }
        }
        if(sayac>0) {
            ort = total / sayac;
            System.out.println("Ortalama: " + ort);
        }else{
            System.out.println("Girilen sayıya kadar 3 ve 4'e tam bölünen sayı bulunamadı!");
        }
    }
}