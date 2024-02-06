import java.util.Scanner;
public class CinZodyagi {
    public static void main(String[] args) {
        int year;
        String burc = null;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Doğum Yılınızı Giriniz: ");
        year = scanner.nextInt();

        year %= 12;

        switch (year){
            case 0:
                burc = "MAYMUN";
                break;
            case 1:
                burc = "HOROZ";
                break;
            case 3:
                burc = "DOMUZ";
                break;
            case 4:
                burc = "FARE";
                break;
            case 5:
                burc = "ÖKÜZ";
                break;
            case 6:
                burc = "KAPLAN";
                break;
            case 7:
                burc = "TAVŞAN";
                break;
            case 8:
                burc = "EJDERHA";
                break;
            case 9:
                burc = "YILAN";
                break;
            case 10:
                burc = "AT";
                break;
            case 11:
                burc = "KOYUN";
                break;
        }
        System.out.println("Çin Zodyağı Burcunuz: "+burc);
    }
}
