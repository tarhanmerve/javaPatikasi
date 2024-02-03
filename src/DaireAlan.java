import java.util.Scanner;
public class DaireAlan {
    public static void main(String[] args) {
        int yaricap,aci;
        double alan, pi=3.14;

        Scanner input = new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        yaricap = input.nextInt();
        System.out.print("Hesaplanacak açı değerini giriniz: ");
        aci = input.nextInt();

        alan = (pi*(yaricap*yaricap)*aci)/360;
        System.out.println("Dairenin Alanı: "+alan);
    }
}
