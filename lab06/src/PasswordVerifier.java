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
		if (!this.isValid()) {
			Random r = new Random();
		
			for (int i = 0; i < r.nextInt(15) + 10 || !this.isValid(); i++) {
				int type = r.nextInt(3);
				
				switch (type) {
				case 0:
					password.append((char) (r.nextInt(26) + 65));
					break;
				case 1:
					password.append((char) (r.nextInt(26) + 97));
					break;
				case 2:
					password.append(r.nextInt(10));
					break;
				}
			}
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