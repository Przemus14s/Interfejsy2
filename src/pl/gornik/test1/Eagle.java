package pl.gornik.test1;

public class Eagle implements Flyable{
    private String name;

    public Eagle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void makeSound() {
        System.out.println("iii, iii...");
    }

    @Override
    public void flying() {
        System.out.println("Mogę latać...");
    }
}
