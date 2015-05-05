import java.util.ArrayList;
import java.util.Scanner;

public class NumbersMenuManager {
	private static NumbersMenuManager uniqueInstance = null;
	private Menu menu2;
	ProjectUtils utils = new ProjectUtils();

	public static NumbersMenuManager getInstance() {
		// TODO Auto-generated method stub
		if (uniqueInstance == null) {
			uniqueInstance = new NumbersMenuManager();
			String menuDisplay = "\n\tMain Menu: "
					+ "\n\t\t1> Process Cuadratic Equation"
					+ "\n\t\t2> Compute Average of List of Numbers"
					+ "\n\t\t3> Exit " + "\n"
					+ "\n\n\tEnter your selection: ";
			
			 uniqueInstance.menu2 = new Menu(menuDisplay, 3, 3);
		}
		   return uniqueInstance;
	        
		}
	public void run() {
        boolean exitMenu = false;
        do {
            menu2.display();
            int choice = menu2.getUserSelection();

            // the above method call will return 0 if the user did not
            // entered a valid selection in the opportunities given...
            // Otherwise, it is valid...
            if (choice == 0) {

                // here the user can be informed that fail to enter a
                // valid input after all the opportunities given....
                // for the moment, just exit....
                exitMenu = true;
            }
            else if (choice == 1) {

                // here goes your code to initiate action associated to
                // menu option 1....
            	Scanner input = new Scanner(System.in);
            	
            	System.out.println("Enter number a");
            	double a = input.nextDouble();
            	System.out.println("Enter number b");
            	double b = input.nextDouble();
            	System.out.println("Enter number c");
            	double c = input.nextDouble();
            	
            	utils.processQuadraticEquation(a, b, c);
               
            }
            else if (choice == 2) {
            	Scanner input = new Scanner(System.in);
            	
            	boolean active = true;
            	ArrayList list = new ArrayList();
            	while(active == true){
            		System.out.println("Enter next Value (-1 to finish): ");
            		double value = input.nextDouble();
            		if(value > 0){
            		list.add(value);}
            		else{active =false;}
            		
            	}
            	utils.computeAverageOfNumbers(list);
            }


            else if(choice==3) {
                exitMenu = true;
            } }
        while (!exitMenu);
    }
}

	
