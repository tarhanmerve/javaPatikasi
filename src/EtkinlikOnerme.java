import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        double temp;

        Scanner inp = new Scanner(System.in);
        System.out.print("Hava sıcaklığını giriniz: ");
        temp = inp.nextDouble();

        if(temp<5){
            System.out.println("KAYAK!");
        }if(5<=temp && temp<=15){
            System.out.println("SİNEMA!");
        }if(10<=temp && temp<25){
            System.out.println("PİKNİK!");
        }if(temp>=25){
            System.out.println("YÜZME!");
        }
    }
}
