import java.util.Scanner;

public class StringMenuManager {
	private static StringMenuManager uniqueInstance = null;
	private Menu menu3;
	ProjectUtils utils = new ProjectUtils();

    public static StringMenuManager getInstance() {
    	if (uniqueInstance == null) {
			uniqueInstance = new StringMenuManager();
			String menuDisplay = "\n\tMain Menu: "
					+ "\n\t\t1> Show Reverse of a Given String"
					+ "\n\t\t2> Format Strings"
					+ "\n\t\t3> Exit " + "\n"
					+ "\n\n\tEnter your selection: ";
			
			 uniqueInstance.menu3 = new Menu(menuDisplay, 3, 3);
		}
		   return uniqueInstance;

}
    
    public void run() {
        boolean exitMenu = false;
        do {
            menu3.display();
            int choice = menu3.getUserSelection();

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
            	System.out.println("Enter string to reverse");
            	Scanner input = new Scanner(System.in);
            	String value = input.next();
            	
            	utils.reverseAString(value);
            	
               
            }
            else if (choice == 2) {
            	System.out.println("Enter string ");
            	Scanner input = new Scanner(System.in);
            	String value = input.nextLine();
            	
            	System.out.println("Enter pattern (Example:xxx---x-x-xx-x-) ");
            	String pattern = input.nextLine();
            	
            	utils.formatAString(pattern, value);
            	
            	
            	
            }

            else if(choice==3) {
                exitMenu = true;
            } }
        while (!exitMenu);
    }
}