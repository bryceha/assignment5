package weekFive;

public class AsteriskLogger implements LoggerInstance {

	@Override
	public void log(String LogString) {

		System.out.println("***" + LogString + "***");
		System.out.println("");
	}

	@Override
	public void error(String ErrorString) {
		
		System.out.println("*************" + repeat("*", ErrorString.length()));
		System.out.println("***Error: " + ErrorString + "***");
		System.out.println("*************" + repeat("*", ErrorString.length()));
		System.out.println("");
	}
	public static String repeat(String str, int times) {
		   return new String(new char[times]).replace("\0", str);
		}
}
