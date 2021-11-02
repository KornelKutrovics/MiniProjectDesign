package tui;
import controller.*;
/**
 * Description of MainMenu goes here.
 * 
 
* @author knol, mhi, hnv
 * @version 2018.10.19
 * @version 2019.03.29 changed menu to danish and changed method names to reflect the other example
 * @version 2019.03.29 changed menu to English
 */
public class MainMenu {
    // instance variables 
    private LoanMenu loanMenu;
    PersonController pc = new PersonController();
    LPController lpc = new LPController();
    /**
     * Constructor for objects of MainMenu
     */
    public MainMenu() {
        // initialise instance variables
        loanMenu = new LoanMenu();
        
    }

    public void start() { 
        boolean exit=false;
        while (!exit) { //! means while exit not is true (that is: false)
            int choice = writeMainMenu();
            if(choice == 1) {
                System.out.println(" Not implemented yet");
                
            }
            else if(choice == 2) { 
                // TODO add code here
                System.out.println(" Not implemented yet");
            }
            else if(choice == 3) {
                loanMenu.start(); 
            }
            else if(choice == 4) {
                generate();
                System.out.println("\nTest data generated!");
            }
            else if(choice==5){
                // TODO add code here
                printAllTest();
            }
            else {
                writeEnd();
                exit = true;
            }//end else
        }//end while
    }
    
    private int writeMainMenu(){
        TextOptions menu = new TextOptions("\n ***Main menu***", "Quit the program");
        menu.addOption("Borrower menu");
        menu.addOption("LP menu");
        menu.addOption("Loan menu");
        menu.addOption("Generate test data");
        menu.addOption("Print all people and LPs");
        return menu.prompt();
    }
    
    private void writeEnd() {
        System.out.println(" Thank you and goodbye ");
    }
    private void generate(){//option 4
        lpc.createLP(123, "t1","author1","today");
        lpc.createLP(1324, "t3","author4","yesterday");
        lpc.createLP(2233, "t2","author2","tomorrow");
        pc.createPerson("Bob", "main 1", 9000, "Aalborg", "123456");
        pc.createPerson("James", "main 7", 9000, "Aalborg", "1254466");
        pc.createPerson("Guy", "main 5", 9000, "Aalborg", "12546");
    }
    private void printAllTest(){ //this is for option 5
        System.out.println("People:");
        pc.printAll();
        System.out.println("LPs:");
        lpc.printAll();
    }
}
