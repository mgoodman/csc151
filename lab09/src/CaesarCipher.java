
public class CaesarCipher implements MessageEncoder {

	private int offset;
	
	public CaesarCipher(int offset) {
		this.offset = offset;
	}

	public String encode(String s) {
		char[] chars = s.toCharArray();
		int max;
		int min;
		
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(chars[i])) {
				continue;
			}
			
			if (Character.isUpperCase(chars[i])) {
				min = 65;
				max = 90;
			} else {
				min = 97;
				max = 122;
			}
			
			if ((chars[i] + this.offset) > max) {
				chars[i] = (char) (chars[i] - 26 + this.offset);
			} else if ((chars[i] + this.offset) < min) {
				chars[i] = (char) (chars[i] + 26 + this.offset);
			} else {
				chars[i] = (char) (chars[i] + this.offset);
			}
				
		}
		
		return new String(chars);
	}

	public String decode(String s) {
		char[] chars = s.toCharArray();
		int max;
		int min;
		
		for (int i = 0; i < s.length(); i++) {
			if (!Character.isLetter(chars[i])) {
				continue;
			}
			if (Character.isUpperCase(chars[i])) {
				min = 65;
				max = 90;
			} else {
				min = 97;
				max = 122;
			}
			
			if ((chars[i] - this.offset) > max) {
				chars[i] = (char) (chars[i] - 26 - this.offset);
			} else if ((chars[i] - this.offset) < min) {
				chars[i] = (char) (chars[i] + 26 - this.offset);
			} else {
				chars[i] = (char) (chars[i] - this.offset);
			}
				
		}
		
		return new String(chars);
	}

}
