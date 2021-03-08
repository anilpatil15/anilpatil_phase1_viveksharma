package FileHandling;

import java.io.IOException;

public class Main {

    //these constant can be moved to enum class
    private static final int numOfMainMenuOptions = 3;
    private static final int numOfFileMenuOptions = 4;
    private static final String filePath = "C:\\Users\\patila\\simpleLearn";

    public static void main(String[] args) {

        int mainMenuChoice;
        MyScanner scanner = new MyScanner();
        Menu menu = new Menu();
        Filehandler filehandler = new Filehandler();

        //iterate until user wants to exit the main menu/application
        do {
            menu.displayMainMenu();
            mainMenuChoice = scanner.scanInt(numOfMainMenuOptions);

            switch (mainMenuChoice) {
                case 1: //Retrieve files
                    filehandler.retrieveFiles(filePath);
                    break;
                case 2: //File Operations (Add/Delete/Searching). Iterate until user wants to exit the file menu
                    int fileMenuChoice;

                    do {
                        menu.displayFileOperationMenu();
                        fileMenuChoice = scanner.scanInt(numOfFileMenuOptions);
                        String fileName;

                        switch (fileMenuChoice) {
                            case 1: //add file
                                fileName = scanner.readFileName();
                                try {
                                    filehandler.addFile(filePath, fileName);
                                } catch (IOException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case 2: //delete file
                                fileName = scanner.readFileName();
                                filehandler.deleteFile(filePath, fileName);
                                break;
                            case 3: //searching file
                                fileName = scanner.readFileName();
                                boolean fileExists = filehandler.searchFile(filePath, fileName);
                                if(fileExists) {
                                    System.out.println(fileName + " file exists");
                                } else {
                                    System.out.println(fileName + " file not found");
                                }
                                break;
                            case 4: //return to main menu
                                System.out.println("Returned to main menu");
                                break;
                        }

                    } while (fileMenuChoice > 0 && fileMenuChoice < numOfFileMenuOptions);
                    break;

                case 3:
                    System.out.println("Closing the application");
                    break;
            }
        } while(mainMenuChoice > 0 && mainMenuChoice < numOfMainMenuOptions);

    }

}
