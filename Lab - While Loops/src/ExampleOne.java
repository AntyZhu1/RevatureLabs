
public class ExampleOne {

	public static void main(String[] args) {
		boolean on = true;
		
		int complete = 0;
		
		while (on) {
			System.out.println("Inside the While Loop");
			//on = false;
			complete += 1;
			if (complete == 10) {
				on = false;
			}
		}
		System.out.println("Outside the While Loop");

	}

}
