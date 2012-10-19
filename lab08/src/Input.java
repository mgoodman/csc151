import java.util.Scanner;

public class Input {

	public static int readInt(Scanner in, String prompt, String error, int min, int max) {
		int input = 0;
		boolean run = true;

		while (run) {
			System.out.println(prompt);
			input = in.nextInt();
			
			if (input >= min && input <= max) {
				run = false;
			} else {
				System.out.println(error);
			}
		}
		
		return input;
	}
	
}
