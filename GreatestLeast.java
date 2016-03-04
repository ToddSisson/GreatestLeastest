package num8;
import java.util.Scanner;

public class GreatestLeast {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = 0;
		int highest = Integer.MIN_VALUE;
		int lowest = Integer.MAX_VALUE;;
		
		while (number != -99){
			System.out.print("Enter a number: ");
			number = input.nextInt();
			if (number < lowest && number != -99){
				lowest = number;
			}
			
			if (number > highest){
				highest = number;
			}
		}
		
		System.out.println("Highest: " + highest);
		System.out.println("Lowest: " + lowest);
		
		input.close();

	}

}
