package pl.gornik.test4;

import java.util.Scanner;

public class BlikPayment implements Payment {

    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Płatność BLIK");
        System.out.println("Podaj kod BLIK");
        int blikCode = scanner.nextInt();
        System.out.println("Kod BLIK " + blikCode);
        System.out.println("Pobrano z konta " + amount + "zł");
    }
}