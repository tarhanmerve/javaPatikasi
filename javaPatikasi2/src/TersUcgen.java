import java.util.Scanner;

public class TersUcgen {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        int n = scanner.nextInt();

        for(int i = 0; i < n; i++) {
            System.out.println(" ");
            for(int k=0; k<(n-i) ; k++) {
                System.out.print("*");
            }
        }
    }
}
