package pl.gornik.test3;

public class Cappucino extends Coffee implements CoffeeCup {
    public Cappucino() {
    }
    @Override
    public void makeCoffee() {
        this.setName("Cappuccino");
        this.setNumberOfBeans(10);
        this.setAmountOfWater(60);
        this.setAmountOfMilk(70);
    }

    @Override
    public String toString() {
        return this.getName() + ", ziaren kawy: " + getNumberOfBeans() + ", wody: " + this.getAmountOfWater() +
                ", mleka: " + this.getAmountOfMilk();
    }
}
