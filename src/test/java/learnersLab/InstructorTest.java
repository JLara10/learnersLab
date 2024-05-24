package learnersLab;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InstructorTest {
    @Test
    void testImplementation(){
        Instructor instructor = new Instructor(10,"Makaila");
        assertTrue(instructor instanceof Teacher);
    }
    @Test
    void testInheritance(){
        Instructor instructor = new Instructor(10,"Makaila");
        assertTrue(instructor instanceof Person);
    }
    @Test
    public void testTeach(){
        Instructor instructor = new Instructor(1, "Messi");
        Student student = new Student(1, "Jonny");
        instructor.teach(student, 10);
        assertEquals(10, student.getTotalStudyTime());
    }
    @Test
    void testLecture(){
        Instructor instructor = new Instructor(1, "Messi");
        Student juan = new Student(8,"juan");
        Student elizabeth = new Student(27,"eli");
        Learner[] students = {juan,elizabeth};
        instructor.lecture(students,100);
        double expected = (juan.getTotalStudyTime() + elizabeth.getTotalStudyTime()) / students.length;
        assertEquals(expected, juan.getTotalStudyTime());
        assertEquals(expected,elizabeth.getTotalStudyTime());
    }


}