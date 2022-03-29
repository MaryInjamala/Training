

public class Calculator {
	public int add(int a , int b) {
		if(a==0) {
			return b;
		}
		return a + b;
	}
	public int subtract(int a , int b) {
		return a - b;
	}
	public int mul(int a , int b) {
		return a * b;
	}
	public float div(int a , int b) {
		try {
			return (float) a/b;
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return 0;	
		}

}
