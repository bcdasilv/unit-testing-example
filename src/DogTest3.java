import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest3 {

    private Dog myDog;

    @BeforeEach
    public void setUp() {
        myDog = new Dog("Jimmy", "Poodle");
    }

    @Test
    public void testDogNameCreation(){
        assertEquals("Jimmy", myDog.getName(),"Error in dog creation" );
    }

    @Test
    public void testDogWeightCreation(){
        assertEquals(5, myDog.getWeight(),"Error in dog creation" );
    }

    @Test
    public void testFeedDog(){
        int weightBeforeEat = myDog.getWeight();
        myDog.eat();
        assertEquals(weightBeforeEat+5, myDog.getWeight(), "Error in increasing dog weight");
    }
}
