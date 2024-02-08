import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,i;
        int nFaktoriyel =1, rFaktoriyel =1, faktoriyel =1, kombinasyon;

        Scanner scan = new Scanner(System.in);

        System.out.println("Kombinasyon hesabı yapılacak");
        System.out.print("n: " );
        n = scan.nextInt();
        System.out.print("r: " );
        r = scan.nextInt();

        for(i=1; i<=n; i++){
            nFaktoriyel *= i;
        }

        for(i=1; i<=r; i++){
            rFaktoriyel *= i;
        }

        for(i=1; i<=(n-r); i++){
            faktoriyel *= i;
        }

        kombinasyon= nFaktoriyel / (rFaktoriyel*faktoriyel);

        System.out.println("C("+n+","+r+ "): " + kombinasyon);

    }

}
