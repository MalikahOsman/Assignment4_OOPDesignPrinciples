package za.ac.cput.malikah.malikah.Question1;

/**
 * Created by Malikah Osmen on 2016-03-26.
 */
public class Dog extends Pet {
    private String petName;

    public Dog()
    {}

    public Dog(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public String move() {
        return "walk";
    }

    @Override
    public String makeSound() {
        return "woof";
    }
}
