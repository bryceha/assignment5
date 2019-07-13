package weekFive;

public class SpacedLogger implements LoggerInstance {

	
	
	@Override
	public void log(String LogString) {
 
		System.out.println(LogString.replace("", " ").trim());
		System.out.println("");
	}

	@Override
	public void error(String ErrorString) {

		System.out.println("ERROR: " + ErrorString.replace("", " ").trim()); 
	}

}
