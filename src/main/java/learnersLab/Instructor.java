package learnersLab;

public class Instructor extends Person implements Teacher{

    public Instructor(long ID, String name) {
        super(ID, name);
    }

    @Override
    public void teach(Learner learner, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / 1;
        learner.learn(numberOfHoursPerLearner);
    }

    @Override
    public void lecture(Learner[] learners, double numberOfHours) {
        double numberOfHoursPerLearner = numberOfHours / learners.length;
        for(Learner learner: learners){
            learner.learn(numberOfHoursPerLearner);
        }
    }
}
