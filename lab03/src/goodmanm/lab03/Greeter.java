

public class Greeter {

	private String greeting = "";
	
	public Greeter(String greeting) {
		this.greeting = greeting;
	}
	
	public String sayGreeting(String name) {
		return greeting + " " + name + "!";
	}
	
}
