import java.util.Scanner;
public class DortveBesinKuvvetleri {
    public static void main(String[] args) {
        int num, i;

        Scanner scan = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num = scan.nextInt();

        for(i=1; i<num; i*=4 ){
            System.out.println(i);
        }

        i=1;
        while(i<num) {
            System.out.println(i);
            i *=5;
        }
    }
}
