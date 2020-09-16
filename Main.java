import java.util.Scanner;
/**
*This program is going to ask the user for the size of pizza they want and then calculate their total with taxes labour cost and energy cost furthermore it will also display a message according to the size of the pizza
*@author Ahmad Zeshan
*/
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
		// create a Scanner for user input
		Scanner input = new Scanner(System.in);
		//sets the variables for the labour and energy cost
		final double labour = 0.75;
		final double POWER_COST = 0.99;
		final double SIZE_COST = 0.50;
		//Prompt the user for what size of pizza they want 
		System.out.println("What is the size of the pizza (in cm):");
		//gets the size of pizza from user 
		int pizzaSize = input.nextInt();
		//calculates the subtotal of the pizza
		double subtotal = pizzaSize * SIZE_COST + labour + POWER_COST;
		//outputs the message to the user about their subtotal
		System.out.println("Subtotal: $" + subtotal);
		//calculates the tax 
		double tax = subtotal * 0.13;
		//outputs the taxes to the user
		System.out.println("Taxes: $" + tax);
		//calculates the total of the user
		double total = subtotal + tax;
		//outputs the total to the user
		System.out.println("Total: $" + total);
		//according to the size of the pizza it outputs a specific message 
		if (pizzaSize <= 20 && pizzaSize >= 1){
			//outputs this message if the pizza size is between 1 and 20cm
			System.out.println("We are going to make you a cute little pizza!");
			} else if (pizzaSize <= 40 && pizzaSize > 20) {
			//outputs this message if the pizza size is between 40 and 20cm
			System.out.println("This will be delicious!");
			} else if (pizzaSize > 40) {
			//outputs this message if the pizza sice is greater than 40
			System.out.println("Whoa, big pizza! You might need a truck to get this home!");
			} else {
			//outputs this message if value is in negative or 0
			System.out.println("Invalid values entered please try again");
				}
	}
}