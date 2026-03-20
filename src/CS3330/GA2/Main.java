package CS3330.GA2;

public class Main {
	public static void main(String[] args0 ) {
		QuestBoard questBoard = new QuestBoard();
		StreakQuest eatAtMorts = new StreakQuest(0,"Eat at Morts for a week",100 , 5);
		StreakQuest visitTheRec = new StreakQuest(1,"Workout at the rec for two weeks",200 , 14);
		EventCheckInQuest attendABasketballGame = new EventCheckInQuest(2, "Support our Stars: Basketball", 150, "Mizzou Basketball Game");
		EventCheckInQuest attendATheaterDepartmentPlay  = new EventCheckInQuest(3, "Support our Stars: Theater", 150, "Life and Literature Play");
		VolunteerQuest pickUpTrashYouSeeInDowntown = new VolunteerQuest(4, "Clean Our Comunity", 300, 4);
		VolunteerQuest donateBlood = new VolunteerQuest(5, "Blood Drive", 100, 1);
		questBoard.addQuest(eatAtMorts);
		questBoard.addQuest(visitTheRec);
		questBoard.addQuest(attendABasketballGame);
		questBoard.addQuest(attendATheaterDepartmentPlay);
		questBoard.addQuest(pickUpTrashYouSeeInDowntown);
		questBoard.addQuest(donateBlood);
		
		Student jimr = new Student("Jim Ries");
		Student joeSchmoe = new Student("Joe Schmoe");
		Student jimr2 = new Student("Jim Ries");
		
		questBoard.assignQuest(jimr, 0);
		questBoard.assignQuest(jimr, 4);
		questBoard.assignQuest(joeSchmoe, 2);
		questBoard.assignQuest(joeSchmoe,  5);
		questBoard.assignQuest(jimr2, 1);
		questBoard.assignQuest(jimr2, 3);
		
		questBoard.completeQuest(jimr, 0);
		questBoard.completeQuest(jimr, 1);
		questBoard.completeQuest(joeSchmoe, 2);
		questBoard.completeQuest(joeSchmoe, 5);
		questBoard.completeQuest(jimr2, 4);
		
		
		questBoard.printAllQuests();
		
		questBoard.printAssignmentsFor(jimr);
		questBoard.printAssignmentsFor(joeSchmoe);
		questBoard.printAssignmentsFor(jimr2);
		
		
		System.out.println(jimr.getPoints());
		System.out.println(joeSchmoe.getPoints());
		System.out.println(jimr2.getPoints());
		
		
		RewardUtil.sumPoints(questBoard.getStudents());
		
		questBoard.completeQuest(jimr, 0); //example error: completing a quest that has already been completed
		
	}
}
