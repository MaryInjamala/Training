
public class Customer {
	public static void main(String[] args) {
		Details c1 = new Details();
		c1.setId(1000);
		System.out.println(c1.getId());
		createDetails();
		
	}

	public static void createDetails() {
		// TODO Auto-generated method stub
		Details []shelf = new Details[5];
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			Details c1 = new Details();
			c1.setId(i+1000);
			shelf[i] = c1;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(shelf[i].getId());
		}
		
	}

	
		
}
	


		
	



