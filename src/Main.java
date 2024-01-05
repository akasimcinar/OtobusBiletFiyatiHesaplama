import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int km = 0;
        int age = 0;
        int tripType = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Mesafeyi km türünden giriniz : ");
        km = input.nextInt();
        System.out.println("Yaşınızı giriniz :");
        age = input.nextInt();
        System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş):");
        tripType = input.nextInt();

        if (km < 0) {
            System.out.println("Hatalı Veri Girdiniz.");
        }else if (age <= 0) {
            System.out.println("Hatalı Veri Girdiniz.");
        }else if (tripType) {

        }
    }
}