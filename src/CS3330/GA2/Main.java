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
		
	}
}
