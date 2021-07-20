
public class Fib {
	
	public int fibonacci(int n) {
		
		if (n == 0) return 0;
		if (n == 1) return 1;
		
		return fibonacci(n-1) + fibonacci (n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fib f = new Fib();
		
		int result = f.fibonacci(2);
		
		System.out.println(result);
		
		result = f.fibonacci(5);
		
		System.out.println(result);
		
		result = f.fibonacci(10);
		
		System.out.println(result);
	}

}
