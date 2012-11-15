import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: Reverse target");
			return;
		}
		
		String fileName = args[0];
		
		FileReader sourceFile = null;
		FileWriter targetFile = null;
		
		Scanner source;
		
		StringBuilder writeBuffer = new StringBuilder();
		
		try {
			sourceFile = new FileReader(fileName);
		} catch (FileNotFoundException e) {
			System.out.println("The file `" + fileName + "` does not exist.");
			return;
		}
		
		source = new Scanner(sourceFile);
		
		while (source.hasNext()) {
			writeBuffer.append(reverse(source.nextLine()) + "\r\n");
		}
		
		source.close();
		
		try {
			sourceFile.close();
		} catch (IOException e) {
			System.out.println("There was a problem closing `" + fileName + "`.");
			return;
		}
		
		try {
			targetFile = new FileWriter(fileName);
			targetFile.write(writeBuffer.toString().trim());
		} catch (IOException e) {
			System.out.println("Could not open `" + fileName + "` for writing.");
			return;
		} finally {
			if (targetFile != null) {
				try {
					targetFile.close();
				} catch (IOException e) {
					System.out.println("There was a problem closing `" + fileName + "`.");
					return;
				}
			}
		}
		
		System.out.println("`" + fileName + "` was successfully reversed.");
	}
	
	private static String reverse(String input) {
		StringBuilder reversedInput = new StringBuilder();
		
		for (int i = input.length() - 1; i >= 0; i--) {
			reversedInput.append(input.charAt(i));
		}
		
		return reversedInput.toString();
	}
	
}
