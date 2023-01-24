
public class MilesFeetInchesToInches {

    public static void main(String[] args) {
        int miles, feet, inches;
        // Get user input
        System.out.print("Please enter miles, feet, and inches: ");
        var scan = new java.util.Scanner(System.in);
        miles = scan.nextInt();
        feet = scan.nextInt();
        inches = scan.nextInt();
        scan.close();
        
        // Compute and display the result
        int totalInches = miles*5280*12 + feet*12 + inches; 
        System.out.println("The total inches are " + totalInches);

    }

}
