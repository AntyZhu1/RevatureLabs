
public class Constructors {
	
	public Constructors() {
		System.out.println("Default Constructor Ran");
	}
	
	public Constructors(int value) {
		System.out.println(value);
	}

	public static void main(String[] args) {
		
		// Create Instances
		Constructors c = new Constructors(2222);
		

        //use the no-arg constructor
        Constructors cNoArg = new Constructors();
	}

}
