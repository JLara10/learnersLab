package learnersLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PeopleTest {

    @Test
    void add() {
    People people = new People();
    Person person1 = new Person(1,"Juan");
    people.add(person1);
    assertTrue(people.contains(person1));
    }

    @Test
    void findById() {
        People people = new People();
        Person person1 = new Person(2, "Messi");
        people.add(person1);
        assertEquals(person1, people.findById(2));

    }

    @Test
    void removePerson() {
        People people = new People();
        Person person1 = new Person(3, "Neymar");
        people.add(person1);
        people.removePerson(person1);
        assertFalse(people.contains(person1));
    }


}