public class Main {

    public static void main(String[] args) {
        Rectangle Rectrect=new Rectangle(2, 4);
        System.out.println("The perimeter of a rectangle of length 2 and width 4 is: "+Rectrect.getCircumference());
        System.out.println("The area of a rectangle whose length is 2 and width is 4 is: "+Rectrect.getArea());

        Circle circle=new Circle(10);
        System.out.println("\nThe circumference of a circle with radius 10 is: "+circle.getCircumference());
        System.out.println("The area of a circle with radius 10 is: "+circle.getArea());

        Trangle triangleTest=new Trangle(3,4,5);
        System.out.println("\nThe perimeter of a triangle of length 3,4,5 is: "+triangleTest.getCircumference());
        System.out.println("The area of a triangle of length 3,4,5 is: "+triangleTest.getArea());
    }

}