package za.ac.cput.malikah.malikah.Question2;

/**
 * Created by Malikah Osmen on 2016-03-25.
 */
public class Cylinder extends Circle {
    private Circle base;
    private int height;

    public Cylinder()
    {}

    /* Composition .. Cylinder 'has a' circle */
    public Cylinder(double r, int h) {
        height = h;
        base = new Circle(rad);
    }

    public double surfaceArea(int rad,int height)
    {

        return 2*PI*rad*height+2*area(5);
    }

    public double volume(int rad, int height)
    {
        return area(rad)*height;
    }



}
