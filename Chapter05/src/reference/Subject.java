package reference;

public class Subject {
	String subjectName;
	int score;
	
	
	public Subject(String name) {
		subjectName = name;
	}
	
	public void setSubjectName(String name) {
		subjectName = name;
	}

	public String getSubjectName() {
		return subjectName;
	}

	public int getScorePoint() {
		return score;
	}

	public void setScorePoint(int score) {
		this.score = score;
	}
}
