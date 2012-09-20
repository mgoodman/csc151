import java.util.Scanner;

public class GraderTester {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("What is the assignment name?");
		String assignmentName = s.next();
		
		System.out.println("How many students?");
		int numberOfStudents = s.nextInt();
		
		for (int i = 0; i < numberOfStudents; i++) {
			System.out.println("Enter student's last name:");
			String lastName = s.next();
			
			System.out.println("Enter the student's score:");
			int score = s.nextInt();
			
			Grader g = new Grader(lastName, assignmentName, score);
			System.out.println("Assignment name: " + g.getAssignment());
			System.out.println("Student's last name: " + g.getStudent());
			System.out.println("Student's score: " + g.getScore());
			System.out.println("Student's letter grade: " + g.getGrade());
		}
	}
	
}
