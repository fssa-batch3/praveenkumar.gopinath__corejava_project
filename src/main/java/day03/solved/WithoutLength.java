package day03.solved;

public class WithoutLength {

	public static void main(String[] args) {
		String s = "Hello";
		int count = 0;
		
		char[] a = s.toCharArray();
		for (char c : a) {
			count++;
		}
		
		System.out.println(count);
	}

}





