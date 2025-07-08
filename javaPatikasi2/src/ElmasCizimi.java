import java.util.Scanner;

public class ElmasCizimi {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        int i,t;

        for(i = 0; i<n; i++) {
        for (int k = 0; k<(n-i-1); k++){
            System.out.print(" ");
        }for (int k = 0; k<(2 * i + 1); k++) {
            System.out.print("*");
        }System.out.println();
        }

        for(t = n-1; t>0; t--) {
            for (int j = 0; j<(n-t); j++){
                System.out.print(" ");
            }for (int j = 0; j<(2 * t - 1); j++) {
                System.out.print("*");
            }System.out.println();
        }
    }
}
