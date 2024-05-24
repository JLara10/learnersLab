package learnersLab;

public class Student extends Person implements Learner{
    private double totalStudyTime;

    public Student(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    @Override
    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
