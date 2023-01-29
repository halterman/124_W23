// Excludes zero units
public class InchesToMilesFeetInches3 {

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
        
        // Display the results
        if (miles > 0) {
            if (miles > 1) {
                System.out.print(miles + " miles ");
            } else {
                System.out.print(miles + " mile ");
            }
        }
        if (feet > 0) {
            if (feet > 1) {
                System.out.print(feet + " feet ");
            } else {
                System.out.print(feet + " foot ");
            }
        }
        if (inches > 0) {
            if (inches > 1) {
                System.out.print(inches + " inches ");
            } else {
                System.out.print(inches + " inch ");
            }
        }

    }

}
