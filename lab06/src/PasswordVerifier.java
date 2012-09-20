import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Random;

public class PasswordVerifier {

	private StringBuilder password;
	private Pattern p = Pattern.compile("^[a-zA-Z]*(?=.{6,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z]).*$");

	public PasswordVerifier(String password) {
		this.password = new StringBuilder(password);
	}

	public void replace(char oldChar, char newChar) {
        for (int i = 0; i < password.length(); i++) {
        	if (password.charAt(i) == oldChar) {
        		password.setCharAt(i, newChar);
        	}
        }
    }
	
	public void strengthen() {
		Random r = new Random();
		while (!this.isValid()) {
			
		}
	}
	
	public boolean isValid() {		
		Matcher m = p.matcher(password.toString());
		
		if (!m.matches()) {
			return false;
		}
		
		return true;
	}
	
	public String getPassword() {
		return password.toString();
	}
}
