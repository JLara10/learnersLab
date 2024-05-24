package learnersLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {


    @Test
    void testImplementation(){
        Student student = new Student(2,"lebron");
        assertTrue(student instanceof Learner);
    }
    @Test
    void testInheritance(){
        Student student = new Student(2,"lebron");
        assertTrue(student instanceof Person);
    }
    @Test
    void testLearn(){

    }
}