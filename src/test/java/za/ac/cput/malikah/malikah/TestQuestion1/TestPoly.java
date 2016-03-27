package za.ac.cput.malikah.malikah.TestQuestion1;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.malikah.malikah.Question1.Cat;
import za.ac.cput.malikah.malikah.Question1.Dog;
import za.ac.cput.malikah.malikah.Question1.Fish;
import za.ac.cput.malikah.malikah.Question1.Pet;

import static junit.framework.Assert.*;

/**
 * Created by Malikah Osmen on 2016-03-26.
 */
public class TestPoly {
    @Before
    public void setUp() throws Exception {
        System.out.println("Polymorphism creating pets of true type cat, dog and fish");

    }

    @Test
    public void testPet() throws Exception {
        Pet kitty = new Cat();
        kitty.setPetName("popcorn");
        kitty.makeSound();
        kitty.move();

        assertEquals("meow", kitty.makeSound());

        Pet dog = new Dog();
        dog.setPetName("sparkles");
        dog.makeSound();
        dog.move();
        assertEquals("woof", dog.makeSound());

        Pet fish = new Fish();
        fish.setPetName("goldilocks");
        fish.makeSound();
        fish.move();
        assertEquals("swim", fish.move());
    }
}
