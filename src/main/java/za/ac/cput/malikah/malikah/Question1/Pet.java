package za.ac.cput.malikah.malikah.Question1;

/**
 * Created by Malikah Osmen on 2016-03-26.
 */
public abstract class Pet {
    private String petName;

    public Pet()
    {}

    public Pet(String petName) {
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

    public abstract String move();
    public abstract String makeSound();
}
