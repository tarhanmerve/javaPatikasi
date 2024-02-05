import java.util.Scanner;
public class SinifGecme {
    public static void main(String[] args) {
        int mat,fizik,turkce,kimya,muzik,sayac=0;
        double ort=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunu giriniz: ");
        mat = input.nextInt();
        if(0<=mat && mat<=100){
            ort += mat;
            sayac++;}

        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        if(0<=fizik && fizik<=100){
            ort += fizik;
            sayac++;}

        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        if(0<=turkce && turkce<=100){
            ort += turkce;
            sayac++;}

        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        if(0<=kimya && kimya<=100){
            ort += kimya;
            sayac++;}

        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        if(0<=muzik && muzik<=100){
            ort += muzik;
            sayac++;}

        ort /= sayac;
        System.out.println("Ortalamanız: " + ort);

        if(ort>=55){
            System.out.print("Tebrikler, sınıfı geçtiniz!");
        }else{
            System.out.print("Sınıfta kaldınız.");
        }
    }
}
