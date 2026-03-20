package CS3330.GA2;

public class Student {
	private String name;
	private int points = 0;
	
	public Student(String name) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("Please enter a valid name.");
		}
		
		this.name = name;
	}
	
	
	public void addPoints(int amount) {
		if (amount <= 0) { //Can't add 0 or negative points because that wouldn't be "adding".
			throw new IllegalArgumentException("Please enter a positive amount.");
		}
		
		points = points + amount;
		
	}
	
	public int getPoints() {
		return points;
	}
	
	@Override
	public String toString() {
		return ("Student: " + name + " has " + points + " point(s).");
	}
	
	@Override
	public int hashCode() {
		return name.hashCode();
	}
	
	@Override
	public boolean equals(Object o) {
		if (o == null) {
			throw new IllegalArgumentException("Please enter a valid object.");
		}
		
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof Student)) {
			return false;
		}
		
		Student other = (Student) o;
		return name.equals(other.name);
		
	}
	
}