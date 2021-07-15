
public class ExampleOne {

	public static void main(String[] args) {
		boolean on = false;
		
		do {
			
			System.out.println("Inside the do-while loop.");
			
		} while (on);
		
		int continuation = 0;
		
		do {
			System.out.println(continuation);
			continuation++;
		} while (continuation < 10);
	}

}
