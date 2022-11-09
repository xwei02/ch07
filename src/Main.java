public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(10);
        System.out.println(circle1.radius);
        Circle circle2 = new Circle(3);
        System.out.println(circle2.radius);
        circle2.radius = 20;
        System.out.println(circle2.radius);
    }
}
