import java.util.Scanner;

public class ders1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        System.out.println("4'ün ve 5'in kuvvetleri:");

        for (int i = 1; i <= sayi; i++) {
            int kuvvet4 = 1;
            int kuvvet5 = 1;

            for (int j = 1; j <= i; j++) {
                kuvvet4 *= 4;
                kuvvet5 *= 5;
            }

            System.out.println("4^" + i + " = " + kuvvet4);
            System.out.println("5^" + i + " = " + kuvvet5);
        }

        scanner.close();
    }
}
