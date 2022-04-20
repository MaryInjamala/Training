
public class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81; //Earths gravity in m/s^2 //a
		double initialVelocity = 0.0;//vi
		double fallingTime = 10.0;//t
		double initialPosition = 0.0;//xi
		double finalPosition = 0.0;
		double x;
		//x(t) = 0.5 × at2 + vit + xi;
		x = (0.5 * ((gravity * fallingTime) * (fallingTime)) 
	            + (initialVelocity * fallingTime) + (initialPosition));
		//After code change
		System.out.println(x);//-490.50000000000006


		//Before code Change
		//System.out.println("The objects position after " + fallingTime + " seconds is " + finalPosition + "m.");
		//output: The objects position after 10.0 seconds is 0.0m.
		
	}

}
