
public class Pyramid {
	public static void main (String [] args) {
		
		//initializes the value for amount of rows
		int rows = 5;
		
		for (int counter = 0; counter < rows; counter++) {
			//This loop adds spaces at the beginning of the row to position the first asterisks
			for (int j = counter; j< rows - 1; j++) {
				System.out.print(" ");
			}
			//This for loop creates the asterisk and adds a space after it
			for(int k = 0; k <= counter; k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
