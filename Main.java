import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int i, d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Sayıyı Giriniz: ");
        d = scanner.nextInt();
        for (i = 1; i <= d; i *= 4) {
            System.out.println("4'kuvvetleri: " + i);
        }
        System.out.println("------------------------------");
        for (i = 1; i <= d; i *= 5) {
            System.out.println("5'kuvvetleri: " + i);
        }


    }

}