package day02.practice;

public class Logger {
	public static void debug (String msg) {
		System.out.println("DEBUG: " + msg);
	}
	public static void info (String msg) {
		System.out.println("ERROR: " + msg);
	}
	
	public static void error (String msg) {
		System.out.println("LOG: " + msg);
	}
	
	public static void debug (int num) {
		
		System.out.println("INFO: " + num);
	}
	
    public static void error (int num) {
		
		System.out.println("ERROR: " + num);
	}
    public static void main(String[] args) {
        Logger.debug("message.");
        Logger.info("message.");
        Logger.error("error..");
        Logger.debug("debug..");
        Logger.info("info..");
        Logger.error("error..");
    }	
}