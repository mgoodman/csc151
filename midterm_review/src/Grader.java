
public class Grader {
	
	private String lastName;
	private String assignmentName;
	private int score;
	
	public Grader(String lastName, String assignmentName, int score) {
		this.lastName = lastName;
		this.assignmentName = assignmentName;
		
		if (score < 0 || score > 100) {
			throw new IllegalArgumentException("Score must be in the range 0-100");
		}
		this.score = score;
	}
	
	public String getStudent() {
		return this.lastName;
	}
	
	public String getAssignment() {
		return this.assignmentName;
	}
	
	public int getScore() {
		return this.score;
	}
	
	public String getGrade() {
		String grade = "A+";
		
		if (this.score <= 59)
			grade = "F";
		
		if (this.score >= 60 && this.score <= 69)
			grade = "D";
		
		if (this.score >= 70 && this.score <= 72)
			grade = "C-";
		if (this.score >= 73 && this.score <= 76)
			grade = "C";
		if (this.score >= 77 && this.score <= 79)
			grade = "C+";
		
		if (this.score >= 80 && this.score <= 82)
			grade = "B-";
		if (this.score >= 83 && this.score <= 86)
			grade = "B";
		if (this.score >= 87 && this.score <= 89)
			grade = "B+";
		
		if (this.score >= 90 && this.score <= 92)
			grade = "A-";
		if (this.score >= 93 && this.score <= 96)
			grade = "A";
		
		return grade;
	}
	
}
