package pl.gornik.test1;

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog("Azor");
        System.out.println(dog.getName() + " daje głos: ");
        dog.makeSound();
        dog.running();
        System.out.println("------------------------");

        Eagle eagle = new Eagle("Janek");
        System.out.println(eagle.getName() + " daje głos: ");
        eagle.makeSound();
        eagle.flying();
        System.out.println("------------------------");

        Shark shark = new Shark("Tadek");
        System.out.println(shark.getName() + " daje głos: ");
        shark.makeSound();
        shark.swimming();
        System.out.println("------------------------");



    }
}