public class FooCorporation {

	public static void main(String[] args) {
		pay("Employee1", 7.50, 35);// name, BasePay, HoursWorked
		pay("Employee2", 8.20, 47);
		pay("Employee3", 10.00, 73);

	}

	private static void pay(String name, double basePay, int hoursWorked) {
		double total = 0;
		double minimumWage = 8.0;
		
		if ((basePay < minimumWage) || (hoursWorked > 60)){
            System.out.println("Error!!!invalid base pay or worked more hours"+ "");
        }
        else if (hoursWorked > 40){
                total = basePay * 40 + 1.5*basePay*(hoursWorked - 40);
            }
		else {
			total = basePay * hoursWorked;
		}
		System.out.println("Your total salary is " + total);
	}
}
//output
//Error!!!invalid base pay or worked more hours
//Your total salary is 0.0
//Your total salary is 414.1
//Error!!!invalid base pay or worked more hours
//Your total salary is 0.0
