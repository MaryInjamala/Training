
public class Shop {
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setPrice(2000);
		System.out.println(b1.getPrice());
		createBooks();
	}

	private static void createBooks() {
		Book []shelf = new Book[15];
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			Book b1 = new Book();
			b1.setPrice(i+2000);
			shelf[i] = b1;
		}
		
		for(int i=0;i<10;i++) {
			System.out.println(shelf[i].getPrice());
		}
	}

}
