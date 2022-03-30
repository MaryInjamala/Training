package Assignment2;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	public static void main(String[] args) {
		
		List<Customer> customers = new ArrayList<>();
		List<Account> accounts = new ArrayList<>();
		
		for(int i=1;i<=3;i++) {
			String name = "Customer"+i;
			String address = "Eluru";
			String email = "123@gmail.com";
			String phone = "999888666";
			
			
			Customer c1 = new Customer(name, address, email, phone);
			customers.add(c1);
		}
		
		//displaying the customers.
		customers.forEach((Customer cu) -> System.out.println(cu));
		
		for(int i=0;i<2;i++) {
			Customer c1 = customers.get(i);
			long millis=System.currentTimeMillis();
			java.sql.Date mydate = new java.sql.Date(millis);
			String date = String.valueOf(mydate);
			double balance =  500;
			Account a = new Account(date, TYPE.SB, balance, c1);
			accounts.add(a);
		}
		
		long millise=System.currentTimeMillis();
		java.sql.Date mydates = new java.sql.Date(millise);
		String dates = String.valueOf(mydates);
		accounts.add(new Account(dates, TYPE.SB, 500, customers.get(2)));
		
		accounts.forEach((Account acco) -> System.out.println(acco));
	}

}
