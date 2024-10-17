
public class Drive {
	public static void main (String[]args) {
		float i = 5;
		//This float gets the response from func. factor and sends i into factor
		factor(i);
	}
	
	
	public static void factor(float n) {
		
		//Checks value of n and if its equal or less than one it ends the loop
		if (n<=1) {
			return;
		}
		
		System.out.print("!");
		
		//Function calls itself while decreasing n by one
		factor(n-1);
		
		System.out.print("*");
		
		return;
	
	}
}