public class Menu {

    private String content;
    // All the content of the menu display as a String. 
    private int nOptions; 
    // Number of options in menu. These are values: 1, ..., nOptions. 
    private int maxChances;
    // Max number of opportunities that this menu gives to its users the enter a valid 
    // selection. 
    public Menu(String content, int nOptions, int maxChances) { 
        this.content = content;
        this.nOptions = nOptions; 
        this.maxChances = maxChances; 
    }
    public Menu(int maxChances) {
        nOptions = 0; 
        int chances = maxChances; 
        
    } 

    //Also add the following methods: 

    public void addHeader(String s) { 
        content = s + "\n"; 
        
    } 

    public void addTail(String s) {
        content = s + "\n";
    } 

    public void addOption(String s){
        content = s + "\n"; 
        //Write code to increment nOptions accordingly and add it to the content
        // of this instance of the menu.....
        // This method should take the string as an argument and should add the 
        // string in the content of the menu as one of the options that such 
        // menu will display whenever the display() method is applied to it. 
        //.... add code..... accordingly following the advice of the instructor....
        nOptions ++;
    
    }
    
        public void display() { 
        ProjectUtils.println(content); 
    }
    /**
 Asks for and reads the user's selection. 
 @return Returns 0 if all the attempts allowed have been
 used by the user, without entering a valid selection. 
 Otherwise, it returns the integer value corresponding to
 the valid selection by the user. 
     */
    public int getUserSelection() { 
        
        int opportunity = 0; 
        boolean valid = false; 
        int selection = 0; 
        while (!valid && opportunity < maxChances) { 

            opportunity++; 
            ProjectUtils.print("\n\nEnter valid selection for this menu: "); 
            selection = ProjectUtils.readInteger(); 
            if (selection >= 1 && selection <= nOptions) 
                valid = true; 
        }

        if (!valid) 
            return 0; 
        else
            return selection; 
    }

    /**
Get the int value representing the exit option in menu
@return the int value corresponding to the exit option 
     */

    public int getExitChoice() { 
        return nOptions; 

    }
}