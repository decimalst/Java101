package examples;

public class DoWhileDifferent {

	public static void main(String[] args) {
		int doWhileCount = 0;
		int whileCount = 0;
		
		while (whileCount < 1 ) {
			System.out.println("I'm in a while loop, but I should never be printed!");
			whileCount++;
		}
		
		do {
			System.out.println("I'm in a do-while loop, but I should never be printed!");
			doWhileCount++;
		} while (whileCount <1 );
	
	}

}
