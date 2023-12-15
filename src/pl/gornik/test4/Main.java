package pl.gornik.test4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj kwotę do zapłaty");
        double amount = scanner.nextDouble();
        System.out.println("Jaki rodzaj płatności");
        System.out.println("1- Płatność gotówką");
        System.out.println("2- Płatność BLIKIEM");
        System.out.println("3- Płatność kartą");
        int userChoice = scanner.nextInt();

        Payment payment = null;
        switch(userChoice) {
            case 1 -> payment = new CashPayment();
            case 2 -> payment = new BlikPayment();
            case 3 -> payment = new CardPayment();
            default -> System.out.println("Wybrałeś niewłaściwą opcję");
        }
        if(userChoice > 0 && userChoice < 4){
            System.out.println("Płatność w toku...\n");
            payment.makePayment(amount);
            System.out.println("Płatność zakonczona");
        }
    }
}