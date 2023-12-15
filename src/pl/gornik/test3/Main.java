package pl.gornik.test3;

public class Main {
    public static void main(String[] args) {
        Espresso espresso = new Espresso();
        espresso.makeDoubleCoffee();
        System.out.println(espresso);
        espresso.makeCoffee();
        System.out.println(espresso);
        System.out.println("-------------------------");

        Cappucino cappucino = new Cappucino();
        cappucino.makeCoffee();
        System.out.println(cappucino);
        System.out.println("-------------------------");

        BasicCoffee basicCoffee = new BasicCoffee();
        basicCoffee.makeCoffee();
        System.out.println(basicCoffee);
        basicCoffee.makeDoubleCoffee();
        System.out.println(basicCoffee);
        System.out.println("-------------------------");
    }
}
