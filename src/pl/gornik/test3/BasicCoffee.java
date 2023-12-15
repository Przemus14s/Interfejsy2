package pl.gornik.test3;

public class BasicCoffee extends Coffee implements CoffeeCup, DoubleCoffee{
    public BasicCoffee() {
    }


    @Override
    public void makeCoffee() {
        this.setName("Kawa normalna");
        this.setNumberOfBeans(10);
        this.setAmountOfWater(110);
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
