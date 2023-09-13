package day10.practice;


public class UserDefineException extends Exception {
	public UserDefineException(String msg) {
		super(msg);
	}

	public UserDefineException(Throwable e) {
		super(e);
	}
}
