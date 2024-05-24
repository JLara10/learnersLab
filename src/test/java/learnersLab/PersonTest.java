package learnersLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    @Test
    void testConstructor(){
        Person person = new Person(15,"Juan");

        assertEquals("Juan",person.getName());
        assertEquals(15,person.getId());
    }

    @Test
    void setName() {
        Person person = new Person(15,"Juan");
        String expected = "lebron";

        person.setName("lebron");
        assertEquals(expected,person.getName());
    }
}