
package Dictionary;

import java.util.Scanner;


public class Validation {
    public int checkInputIntLimit(int min, int max) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if(result < min || result > max) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number in rage [" + min + ", " + max + "]");
                System.out.print("Enter again");
            }
        }
                
    }
    
    public String checkInputString() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            String result = sc.nextLine().trim();
            if(result.isEmpty()) {
                System.err.println("Not empty");
                System.out.print("Enter again: ");
            } else {
                return result;
            }
        }
    }
    
    
    public boolean checkInputYN() {
        System.out.print("Do you want to replece(Y/N) ?");
        while(true) {
            String result = checkInputString();
            if(result.equalsIgnoreCase("Y")) {
                return true;
            } 
            if(result.equalsIgnoreCase("N")) {
                return false;
            }
            System.err.println("Please input y/Y or n/N");
            System.out.print("Enter again");
        }
    }
}
