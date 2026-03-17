package CS3330.GA2;

public class StreakQuest extends AbstractQuest {
    private int days;

    public StreakQuest(int id, String title, int basePoints, int days) {
        super(id, title, basePoints);
        
        if (days <= 0) {
            throw new IllegalArgumentException("days must be positive");
        }
        
        this.days = days;
    }

    public int getDays() {
        return days;
    }

    @Override
    public int completeFor(Student s) {
        isCompleted();
        int points = getBasePoints() + (days * 2);//Completion rule: linear bonus: basePoints + (days * 2)
        s.addPoints(points);
        return points;
    }

    @Override
    public String toString() {
        return getId() + ", " + getTitle() + ", " + getBasePoints() + ", " + days + ", " + isCompleted();
    }
}
