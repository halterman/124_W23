
public class AddEm3 {

    public static void main(String[] args) {
        int sum = 0;
        var scan = new java.util.Scanner(System.in);
        System.out.print("Please enter six numbers to add: ");
        int[] nums = new int[6];
        int count = 0;
        while (count < 6) {
            nums[count] = scan.nextInt();
            sum += nums[count];
            count++;
        }
        System.out.println(nums[0] + " + " + nums[1] + " + " 
                           + nums[2] + " + " + nums[3]  
                           + " + " + nums[4] + 
                           " + " + nums[5] + " = " + sum);
    }
}
