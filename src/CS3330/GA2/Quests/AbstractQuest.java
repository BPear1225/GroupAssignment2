package CS3330.GA2.Quests;

import CS3330.GA2.Student;

public abstract class AbstractQuest implements Quest {
	private int id;
	private String title;
	private int basePoints;
	protected boolean isCompleted;
	
	public AbstractQuest(int id,String title,int basePoints) {
		if(id<0) {
			throw new IllegalArgumentException("Id must be a positive integer");
		}
		if(title==null || title.isBlank()) {
			throw new IllegalArgumentException("A quest must have a title");
		}
		if(basePoints<=0) {
			throw new IllegalArgumentException("A quest must award points");
		}
		this.id = id;
		this.title = title;
		this.basePoints = basePoints;
	}
	
	@Override
	public int getId() {
		return id;
	}

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public int getBasePoints() {
		return basePoints;
	}

	@Override
	public boolean isCompleted() {
		return isCompleted;
	}
	
	public abstract String getUniqueProperty();
	
	public abstract int completeFor(Student s);
	
	@Override
	public String toString(){
		return "Quest #"+getId() + ", a " + this.getClass().getName()+" quest: "+ getTitle() + ", " + getBasePoints() + ", " + getUniqueProperty() + ", " + isCompleted();
	}
}
