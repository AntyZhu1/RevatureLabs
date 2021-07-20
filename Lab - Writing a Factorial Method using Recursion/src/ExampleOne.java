
public class ExampleOne {
	
	public static void main(String[] args) {
		//Create dummy data for the method
		int input = 5;
		
		
		ExampleOne e = new ExampleOne();
		
		//call methods here
		System.out.println(e.factorial(input));
	}
	
	//create method here
	public int factorial(int num) {
		if (num <=0) return 0;
		if (num == 1) return 1;
		
		return num * factorial(num-1);
	}
}
