
public class InchesToMilesFeetInches {

    public static void main(String[] args) {
        int miles, feet, inches, totalInches;
        // Get user input
        System.out.print("Please enter the total number of inches: ");
        var scan = new java.util.Scanner(System.in);
        totalInches = scan.nextInt();
        scan.close();
        int inchesPerMile = 12 * 5280;
        
        // Compute the number of miles in the given inches
        miles = totalInches / inchesPerMile;
        totalInches = totalInches % inchesPerMile;
        // Compute the number of feet in the remaining inches
        feet = totalInches / 12;
        inches = totalInches % 12;
        
        // Compute and display the result
        System.out.println(miles + " mi " + feet + " ft " + inches + " in");

    }

}
