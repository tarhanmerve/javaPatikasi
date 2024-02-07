import java.util.Scanner;
public class SayiToplam {
    public static void main(String[] args) {
        int num,total=0;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Sayi giriniz: ");
            num = scanner.nextInt();

            if(num %4 ==0){
                total += num;
            }
        }while (num %2 ==0);

        System.out.println("Girilen sayılardan 4'ün katı olanların toplamı: " + total);
    }
}
