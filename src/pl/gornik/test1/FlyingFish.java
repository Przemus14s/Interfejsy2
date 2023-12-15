package pl.gornik.test1;

public class FlyingFish implements Swimmable,Flyable{
    private String name;

    public FlyingFish(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {

    }

    @Override
    public void flying() {

    }

    @Override
    public void swimming() {

    }
}
