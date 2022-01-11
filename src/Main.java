public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);
        shape = new Shape("red", false);
        System.out.println(shape);
        Circle circle=new Circle();
        circle = new Circle(3.5, "indigo", false);
        System.out.println(circle);
    }
}
