package za.ac.cput.malikah.malikah.Question1;

/**
 * Created by Malikah Osmen on 2016-03-25.
 */
public class Circle {


    protected int rad;
    protected final double PI = 3.14;
    public Circle()
    {}

    public Circle(int rad)
    {
        this.rad = rad;
    }

    public float getRadius() {
        return rad;
    }

    public void setRadius(int rad) {
        this.rad = rad;
    }

    public double diameter(int rad)
    {
        return rad*2;
    }
    public double circumference(int rad)
    {
        return 2*PI*rad;
    }
    public double area(int rad)
    {
        return PI*(rad*rad);
    }


    @Override
    public String toString() {
        return "Circle{" +
                "rad=" + rad +
                ", PI=" + PI +
                '}';
    }
}
