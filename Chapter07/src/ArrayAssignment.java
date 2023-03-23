
import java.util.Arrays;
import java.util.Random;

public class ArrayAssignment {
    private static Random rand = new Random();
    
    public static int[] makeRandomArray(int size, int limit) {
        int[] result = new int[rand.nextInt(size)];
        for (int i = 0; i < result.length; i++) {
            result[i] = rand.nextInt(limit);
        }
        return result;
    }

    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            System.out.println(Arrays.toString(makeRandomArray(10, 100)));
//        }
        int[] a = makeRandomArray(10, 100);
        System.out.println("a = " + Arrays.toString(a));

//        // Makes an alias --- not what we really want (usually)
//        int[] workingCopy = a;
        
        int[] workingCopy = new int[a.length];
        for (int i = 0; i < workingCopy.length; i++) {
            workingCopy[i] = a[i];
        }
        
        System.out.println("working copy = " + Arrays.toString(workingCopy));
        
        workingCopy[rand.nextInt(workingCopy.length)] = -1;
        System.out.println("working copy = " + Arrays.toString(workingCopy));
        
        System.out.println("a = " + Arrays.toString(a));
    }

}
