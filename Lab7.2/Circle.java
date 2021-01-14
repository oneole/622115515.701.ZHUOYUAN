public class Circle {
    int r;

    public int getR() {
        return r;
    }

    public void setR(int r) {
        this.r = r;
    }

    Point p;

    public Point getP() {
        return p;
    }

    public void setP(Point p) {
        this.p = p;
    }

    public Circle()
    {

    }
    public Circle(int r,Point p)
    {
        this.r = r;
        this.p = p;
    }

    public boolean isOverLap(Circle other)
    {

        double dis = this.p.distance(other.p);

        double sumR = r+other.r;

        return sumR>= dis? true:false;
    }



}
