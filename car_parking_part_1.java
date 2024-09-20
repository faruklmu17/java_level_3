

// Print: Welcome to X Automatic Parking Lot!
// Ask the user: Would you like to park here? Type Yes to continue
// If the response is NOT a Yes, return the user to step #1 to display the welcome message again.
// If the response is Yes, Print: Hello, we have 5 parking spots [x, y, z, a, b] available at this moment.
// 	a.  The number 5 and the list should come from: parkingSpotNumbers (not hard coded!)
// b. After showing the list,  print: For how long do you want to park? The maximum duration is 12 hours and the minimum is 0.5 hours.
// If the driver does not choose a value from 0.5 hrs  to 12  hrs, print: An invalid selection is made. Please try again! Return the user to step #5 (b)  so that they can type a valid number.
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    Random random = new Random();
	    HashSet<Integer> parkingSpotNumbers = new HashSet<>();
	    // Step-2:Generate 5 random unique integer numbers (between 1 to 20) and save them in an ArrayList and name it:  parkingSpotNumbers

	    while(true){
	        int number = random.nextInt(20)+1;
	        parkingSpotNumbers.add(number);
	        if (parkingSpotNumbers.size()==5){
	            break;
	        }
	    }
	    
	    while (true){
		System.out.println("Welcome to X Automatic Parking Lot!");
		System.out.println("Would you like to park here? Type Yes to continue");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("yes")){
		    System.out.println("Hello, we have "+parkingSpotNumbers.size()+" parking spots "+parkingSpotNumbers +" available at this moment.");
		    while (true){
		    System.out.println("For how long do you want to park? The maximum duration is 12 hours and the minimum is 0.5 hours.");
		   double  parkingDuration = sc.nextDouble();
		   
		   if (parkingDuration<0.5 || parkingDuration>12){
		       
		       System.out.println("An invalid selection is made. Please try again!");
		   }
		   
		} // end of the third loop (checking if the use selects a valud parking duration)
		   
		} //end of yes 
		
		else {
		    System.out.println("Not a valid response!");
		}
		
	    } // end of the second loop
		// end of of the code
	}
}
