package pl.gornik.test1;

public class Shark implements Swimmable{
    private String name;

    public Shark(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("bul, bul...");
    }

    @Override
    public void swimming() {
        System.out.println("Pływam w oceanie...");
    }
}
