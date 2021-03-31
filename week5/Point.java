public class Point {

    private int x;
    public int getX()
    {
        return  x;
    }
    public void setX(int x)
    {
        this.x = x;
    }

    private int y;
    public  int getY()
    {
        return y;
    }
    public void setY(int y)
    {
        this.y = y;
    }

    public Point()
    {

    }
    public Point (int x,int y)
    {
        this.x = x;
        this.y = y;
    }


    double distance(Point other)
    {
        double x = this.x-other.x;
        double y = this.y-other.y;
        double s = Math.pow(x,2)+Math.pow(y,2);
        return  Math.pow(s,0.5);
    }


}