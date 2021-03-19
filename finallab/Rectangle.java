public class Rectangle extends Shape {

    private double  a;
    private double  b;

    public Rectangle(double a,double b) {
        this.a=a;
        this.b=b;
    }

    @Override
    public double getCircumference() {
        return 2*(a+b);
    }
    @Override
    public double getArea() {
        return a*b;
    }
    @Override
    public double getGirth() {
        return 0;
    }

}
