package pl.gornik.test4;

import java.util.Scanner;

public class CashPayment implements Payment{

    @Override
    public void makePayment(double amount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Płatność gotówką");
        System.out.println("Jaką kwotę wpłacono");
        double value = scanner.nextDouble();
        while(value < amount) {
            System.out.println("Podaj kwotę większą niż kwota do zapłaty");
            value = scanner.nextDouble();
        }
        System.out.println("Kwota do zapłaty " + amount + "zł");
        System.out.printf("Reszta: %.2f\n",value - amount);
    }
}
