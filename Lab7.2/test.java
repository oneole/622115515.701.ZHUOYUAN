public class test {
    public static void main(String[] args) {
        Point p1 = new Point(5, 3);
        Point p2 = new Point(2, 4);
        System.out.println(p1.distance(p2));


        Circle c1 = new Circle(5, p1);
        Circle c2 = new Circle(3, p2);

        System.out.println(c1.isOverLap(c2));
    }
}