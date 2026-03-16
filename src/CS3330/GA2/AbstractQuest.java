package CS3330.GA2;

public abstract class AbstractQuest implements Quest {
	private int id;
	private String title;
	private int basePoints;
	private boolean isCompleted;
	
	public AbstractQuest(int id,String title,int basePoints) {
		if(id<=0) {
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
	
	@Override
	public String toString(){
		return getTitle() + ": A quest that aponcompletion will award " + getBasePoints()+" that is curently "+ (isCompleted? "incomplete": "complete");
	}
}
