import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest1 {



    @Test
    public void testDogNameCreation(){
        Dog myDog = new Dog("Jimmy", "Poodle");
        assertEquals("Jimmy", myDog.getName(),"Error in dog creation" );
    }

    @Test
    public void testDogWeightCreation(){
        Dog myDog = new Dog("Jimmy", "Poodle");
        assertEquals(5, myDog.getWeight(), "Error in dog creation");
    }
}
