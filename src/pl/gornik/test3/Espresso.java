package pl.gornik.test3;

public class Espresso extends Coffee implements CoffeeCup,DoubleCoffee{
    public Espresso() {
    }

    @Override
    public void makeCoffee() {
        this.setName("Esspresso");
        this.setNumberOfBeans(10);
        this.setAmountOfWater(30);
    }

    @Override
    public String toString() {
        return this.getName() + ", ziaren kawy: " + getNumberOfBeans() + ", wody: " + this.getAmountOfWater();
    }

    @Override
    public void makeDoubleCoffee() {
        makeCoffee();
        this.setName(this.getName() + " x 2");
        this.setNumberOfBeans(this.getNumberOfBeans() * 2);
        this.setAmountOfWater(this.getAmountOfWater() * 2);

    }
}
