package CS3330.GA2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QuestBoard {
    private Map<Integer, Quest> questsById;
    private Map<Student, List<Quest>> assignments;
    
    public QuestBoard() {
        questsById = new HashMap<>();
        assignments = new HashMap<>();
    }

    public void addQuest(Quest q) {
        
    	if (questsById.containsKey(q.getId())) {
            throw new IllegalArgumentException("Duplicate quest id detected");
        }
        
        questsById.put(q.getId(), q);
    }

    public Quest findQuest(int id) {
        return questsById.get(id);
    }

    public void assignQuest(Student s, int questId) {
        Quest q = findQuest(questId);
        
        if (q == null) {
            throw new IllegalArgumentException("Quest not found");
        }

        List<Quest> studentQuests = assignments.get(s);
        
        if (studentQuests == null) {
            studentQuests = new ArrayList<>();
            assignments.put(s, studentQuests);
        }

        // Design choice: same quest cannot be assigned to the same student multiple times
        if (studentQuests.contains(q)) {
            throw new IllegalArgumentException("Quest has already been assigned to this student");
        }

        studentQuests.add(q);
    }

    public int completeQuest(Student s, int questId) {
        List<Quest> studentQuests = assignments.get(s);
        
        if (studentQuests == null) {
            throw new IllegalArgumentException("No assignments for this student");
        }

        Quest q = findQuest(questId);
        
        if (q == null || !studentQuests.contains(q)) {
            throw new IllegalArgumentException("Quest not assigned to this student");
        }

        return q.completeFor(s);
    }

    public void printAllQuests() {
    	List<Quest> questList = List.copyOf(questsById.values());
        RewardUtil.printAll(questList);
    }

    public void printAssignmentsFor(Student s) {
        List<Quest> studentQuests = assignments.get(s);
        
        if (studentQuests == null) {
            System.out.println("No assignments for " + s);
            return;
        }
        
        System.out.println("Assignments for " + s + ":");
        
        RewardUtil.printAll(studentQuests);
    }
    
    public List<Student> getStudents() {
		List<Student> students = List.copyOf(assignments.keySet());
		return students;
	}
}

