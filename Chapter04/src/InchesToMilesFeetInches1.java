// Adapted from the program in the Chapter 2 project
public class InchesToMilesFeetInches1 {

    public static void main(String[] args) {
        int miles, feet, inches, totalInches;
        // Get user input
        System.out.print("Please enter the total number of inches: ");
        var scan = new java.util.Scanner(System.in);
        totalInches = scan.nextInt();
        scan.close();
        final int INCHES_PER_FOOT = 12;
        final int INCHES_PER_MILE = INCHES_PER_FOOT * 5280;
        
        
        
        // Compute the number of miles in the given inches
        miles = totalInches / INCHES_PER_MILE;
        totalInches = totalInches % INCHES_PER_MILE;
        // Compute the number of feet in the remaining inches
        feet = totalInches / INCHES_PER_FOOT;
        inches = totalInches % INCHES_PER_FOOT;
        
        // Compute and display the result
        System.out.println(miles + " mi " + feet + " ft " + inches + " in");

    }

}
