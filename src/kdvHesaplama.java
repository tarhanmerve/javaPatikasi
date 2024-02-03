import java.util.Scanner;
public class kdvHesaplama {
    public static void main(String[] args) {
        double tutar, kdvOran, kdvliTutar, kdvTutar;

        System.out.print("Ücret tutarını giriniz: ");
        Scanner input = new Scanner(System.in);
        tutar = input.nextDouble();
        System.out.println("KDV'siz Fiyat: "+tutar);

        kdvOran = (tutar>=1000) ? 0.08: 0.18;
        kdvTutar = tutar*kdvOran;
        kdvliTutar = tutar+kdvTutar;

        System.out.println("KDV'li Fiyat: "+kdvliTutar);
        System.out.println("KDV oranı: "+kdvOran);
        System.out.println("KDV Tutarı: "+ kdvTutar);
    }
}
