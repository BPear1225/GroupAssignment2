package CS3330.GA2;

public class VolunteerQuest extends AbstractQuest {
    private int hours;

    public VolunteerQuest(int id, String title, int basePoints, int hours) {
        super(id, title, basePoints);
        
        if (hours <= 0) {
            throw new IllegalArgumentException("Please enter a valid amount of hours");
        }
        
        this.hours = hours;
    }

    public int getHours() {
        return hours;
    }

    @Override
    public int completeFor(Student s) {
        isCompleted();
        int points = getBasePoints() * hours;
        s.addPoints(points);
        return points;
    }

    @Override
    public String toString() {
        return getId() + ", " + getTitle() + ", " + getBasePoints() + ", " + hours + ", " + isCompleted();
    }
}
