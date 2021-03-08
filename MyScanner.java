package FileHandling;

import java.util.Scanner;

public class MyScanner {

    private static final int numOfScanAttempts = 3;

    public int scanInt(int numOfMenuOptions) {

        Scanner scan = new Scanner(System.in);
        int counter = 0;
        int numOfAttemptsLeft = numOfScanAttempts;
        while(counter < numOfScanAttempts) {
            numOfAttemptsLeft--;
            boolean isAnInt = scan.hasNextInt();

            if(isAnInt) {
                int number = scan.nextInt();
                if(number > 0 && number <= numOfMenuOptions) {
                    return number;
                }
                else {
                    System.out.println("Please enter valid option. " +
                            "You have " + numOfAttemptsLeft + " more attempts");
                }
            } else {
                System.out.println("Please enter valid option. " +
                        "You have " + numOfAttemptsLeft + " more attempts");
            }
            scan.nextLine();
            counter++;
        }

        return numOfMenuOptions;
    }

    public String readFileName() {
        System.out.println();
        System.out.println("Please enter file name: ");
        Scanner scanFileName = new Scanner(System.in);
        return scanFileName.nextLine();
    }
}
