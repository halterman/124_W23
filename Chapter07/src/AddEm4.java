
public class AddEm4 {

    public static void main(String[] args) {
        final int NUMBER_OF_NUMBERS = 10;
        int sum = 0;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter " + NUMBER_OF_NUMBERS 
                         + " numbers to add: ");
        int[] nums = new int[NUMBER_OF_NUMBERS];
        for (int count = 0; count < nums.length; count++) {
            nums[count] = scan.nextInt();
            sum += nums[count];
        }
        System.out.print(nums[0]);
        for (int i = 1; i < nums.length; i++) {
            System.out.print(" + " + nums[i]);
        }
        System.out.println(" = " + sum);
    }
}
