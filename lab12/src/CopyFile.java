import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CopyFile {

	public static void main(String[] args) {
		if (args.length != 2) {
			System.out.println("Usage: CopyFile source target");
			return;
		}
		
		String sourceName = args[0];
		String targetName = args[1];
		
		FileReader sourceFile = null;
		FileWriter targetFile = null;
		
		Scanner source = null;
		
		try {
			sourceFile = new FileReader(sourceName);
		} catch (FileNotFoundException e) {
			System.out.println("Source file `" + sourceName + "` not found!");
			return;
		}
		
		try {
			targetFile = new FileWriter(targetName);
			
			source = new Scanner(sourceFile);
			
			StringBuilder writeBuffer = new StringBuilder();
			
			while (source.hasNext()) {
				writeBuffer.append(source.nextLine()).append("\r\n");
			}
			
			targetFile.write(writeBuffer.toString().trim());
		} catch (IOException e) {
			System.out.println("You do not have the necessary privileges to write to `" + targetName +"`.");
			return;
		} finally {
			if (sourceFile != null) {
				try {
					sourceFile.close();
				} catch (IOException e) {
					System.out.println("There was an error closing `" + sourceName + "`.");
					return;
				}
			}
			
			if (targetFile != null) {
				try {
					targetFile.close();
				} catch (IOException e) {
					System.out.println("There was an error closing `" + targetName + "`.");
					return;
				}
			}
			
			
			if (source != null) {
				source.close();
			}
		}
		
		System.out.println("Contents of `" + sourceName + "` successfully copied to `" + targetName + "`.");
	}
	
}
