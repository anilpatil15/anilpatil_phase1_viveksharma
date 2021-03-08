package FileHandling;

public class Menu {

        public void displayMainMenu() {

            System.out.println("********************************************************************************");
            System.out.println("***************Welcome to Lockers Pvt Ltd **********************************");
            System.out.println("********************************************************************************");
            System.out.println("************************* Develpoed by: Anil Patil *****************************");
            System.out.println("********************************************************************************");
            System.out.println("******************************** Main Menu *************************************");
            System.out.println();
            System.out.println("1. Retrieve existing files");
            System.out.println("2. File operations (Add/Delete/Searching)");
            System.out.println("3. Close the application");
            System.out.println();
            System.out.println("********************************************************************************");
            System.out.println();
            System.out.println("Please enter your choice: ");
        }

        public void displayFileOperationMenu() {
            System.out.println();
            System.out.println("********************************************************************************");
            System.out.println("Please select from below options:");
            System.out.println();
            System.out.println("1. Add a file");
            System.out.println("2. Delete a file");
            System.out.println("3. Search a file");
            System.out.println("4. Return to main menu");
            System.out.println("********************************************************************************");
            System.out.println();
            System.out.println("Please enter your choice: ");
        }
}
