package polymorphismDemo;

public class Main {

	public static void main(String[] args) {
		//EmailLogger Logger = new EmailLogger();
		//Logger.Log("Log Mesajı");
		
//		BaseLogger loggers[] = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new EmailLogger(), new ConsoleLogger()};
//		
//		for(BaseLogger logger:loggers) {
//			logger.Log("Log mesajı");
//		}
	
	CustomerManager customerManager = new CustomerManager(new FileLogger());
	customerManager.add();
	
	
	}

}
