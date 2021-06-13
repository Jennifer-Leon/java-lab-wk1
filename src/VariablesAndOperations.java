
public class VariablesAndOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// create a variable to hold the quantity of available plane seats left on a flight
		int availablePlaneSeats = 10;
// create a variable to hold the cost of groceries at checkout
		double costOfGroceries = 55.35;
// create a variable to hold a person's middle initial
		char middleInitial = 'a';
// create a variable to hold true if it's hot outside and false if it's cold outside
		boolean isItHotOutside = true;
// create a variable to hold a customer's first name		
		String customersFirstName = "Jennifer";
// create a variable to hold a street address
		String streetAddress = "1234 E Elms street";
// print all variables		
		
		System.out.println("Available Plane Seats: " + availablePlaneSeats);
		System.out.println("Cost of Groceries: " + costOfGroceries);
		System.out.println("Customer's Middle Initial: " + middleInitial);
		System.out.println("Is it hot outside: " + isItHotOutside);
		System.out.println("Customer's First Name: " + customersFirstName);
		System.out.println("Street Address: " + streetAddress);
		
// a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availablePlaneSeats = availablePlaneSeats - 2;
		System.out.println(availablePlaneSeats);
// impulse candy bar purchase, add 2.15 to the grocery total
		costOfGroceries += 2.15;
		System.out.println(costOfGroceries);
// birth certificate was printed incorrectly, change the middle initial to something else
		middleInitial = 'C';
		System.out.println(middleInitial);
// the season has changed, update the hot outside variable to be opposite of what it was
		isItHotOutside = !isItHotOutside;
		System.out.println(isItHotOutside);
// create a new variable call full name using the customer's first name, the middle initial, and a last name of your choice
		String fullName = customersFirstName + " " + middleInitial + "." + " Smith";	
		System.out.println(fullName);		
// print a line to the console that introduces the customer and says they live at the address available 
		System.out.println("Hi, my name is " + fullName + " and I live at " + streetAddress + ".");		
				
		
	}

}
