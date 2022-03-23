
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Logger asteriskLogger = new AsteriskLogger();
		Logger spacedLogger = new SpacedLogger();
		
	
		
		asteriskLogger.log("Testing");
		asteriskLogger.error("This");
		spacedLogger.log("Program");
		spacedLogger.error("Now");
		
	}

}
