import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        int sayi1,sayi2,islem;

        Scanner input = new Scanner(System.in);
        System.out.print("1. sayıyı giriniz: ");
        sayi1 = input.nextInt();
        System.out.print("2. sayıyı giriniz: ");
        sayi2 = input.nextInt();
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        System.out.print("Yapılacak işlemi seçiniz: ");
        islem = input.nextInt();

        switch (islem){
            case 1 :
                System.out.print("Toplama işlemi sonucu: " + (sayi1+sayi2));
                break;
            case 2 :
                System.out.print("Çıkarma işlemi sonucu: " + (sayi1-sayi2));
                break;
            case 3 :
                System.out.print("Çarpma işlemi sonucu: " + (sayi1*sayi2));
                break;
            case 4 :
                if(sayi2!=0){
                System.out.print("Bölme işlemi sonucu: " + (sayi1/sayi2));}
                else{
                    System.out.println("Bir sayi sıfıra bölünemez!");}
                break;
            default:
                System.out.print("Hatalı işlem seçimi yaptınız!");
        }
    }
}
