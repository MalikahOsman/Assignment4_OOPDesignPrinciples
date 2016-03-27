package za.ac.cput.malikah.malikah.Question1;

/**
 * Created by Malikah Osmen on 2016-03-25.
 */
public class Cylinder extends Circle {
    private int base;
    private int height;

    public Cylinder()
    {}
    public Cylinder(int rad, int height)
    {
        super(rad);
        this.height = height;
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
