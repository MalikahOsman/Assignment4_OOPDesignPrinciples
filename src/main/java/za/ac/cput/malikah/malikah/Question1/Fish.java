package za.ac.cput.malikah.malikah.Question1;

/**
 * Created by Malikah Osmen on 2016-03-26.
 */
public class Fish extends Pet {
    private String petName;

    public Fish() {

    }
    public Fish(String petName) {
        this.petName = petName;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }



    @Override
    public String move() {
        return "swim";
    }

    @Override
    public String makeSound() {
        return "No sound";
    }
    @Override
    public String toString() {
        return super.toString();
    }
}
