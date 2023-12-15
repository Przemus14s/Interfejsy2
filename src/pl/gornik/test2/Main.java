package pl.gornik.test2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        double wynik = circle.calculateArea();
        System.out.println("Pole koła to " + wynik);

        Rectangle rectangle = new Rectangle(10,5);
        double wynik1 = rectangle.calculateArea();
        System.out.println("Pole prostokąta to " + wynik1);
    }
}
