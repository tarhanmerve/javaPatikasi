import java.util.Scanner;

public class Ortalama {
    public static void main(String[] args) {
        int mat,fizik,kimya,turkce,tarih,muzik;
        System.out.print("Matematik notunu giriniz: ");
        Scanner input = new Scanner(System.in);
        mat = input.nextInt();
        System.out.print("Fizik notunu giriniz: ");
        fizik = input.nextInt();
        System.out.print("Kimya notunu giriniz: ");
        kimya = input.nextInt();
        System.out.print("Türkçe notunu giriniz: ");
        turkce = input.nextInt();
        System.out.print("Tarih notunu giriniz: ");
        tarih = input.nextInt();
        System.out.print("Müzik notunu giriniz: ");
        muzik = input.nextInt();
        double ort = (mat+fizik+kimya+turkce+tarih+muzik)/6;
        System.out.println("Not ortalamanız: "+ort);
        boolean sonuc= ort>=60;
        String str = (sonuc) ? "Sınıfı geçti.": "Sınıfta kaldı.";
        System.out.print(str);
    }
}
