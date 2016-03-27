package za.ac.cput.malikah.malikah.Question_3.SRP.violate;

/**
 * Created by Malikah Osmen on 2016-03-27.
 */
public class Rectangle {
    private int length;

    public Rectangle() {
    }
    private int width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int area(int l, int w)
    {

        return l*w;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }

}
