import java.util.Scanner;
public class UcgenAlan {
    public static void main(String[] args) {
        double a,b,c,cevre,alan,u;

        Scanner input = new Scanner(System.in);
        System.out.print("1. kenari giriniz: ");
        a= input.nextDouble();
        System.out.print("2. kenari giriniz: ");
        b= input.nextDouble();
        System.out.print("3. kenari giriniz: ");
        c= input.nextDouble();

        cevre= a+b+c;
        u = cevre/2;
        alan = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("üçgenin alanı: " +alan);
    }
}
