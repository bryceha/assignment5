package weekFive;

public class App5 {
	
	public static void main(String[] args) {

		LoggerInstance logger = new AsteriskLogger();
		
		logger.log("What up");
		logger.error("Asterisks for days");
		
		LoggerInstance logger2 = new SpacedLogger();
		
		logger2.log("Vaporwave");
		logger2.error("Too Aesthetic");
		
	}

}
