
public class ArrayRoutines {
    /**
     * Computes the sum of the elements in an array of 
     * integers.
     * @param a the array to sum
     * @return the sum of all the elements in the array.
     */
    public static int sum(int[] a) {
        int s = 0;
        for (int elem : a) {
            s += elem;
        }
        return s;
    }
    
    /**
     * Rearranges the elements in an array into non-descending order.
     * @param a the array to sort.
     */
    public static void sort(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[smallest]) {
                    smallest = j;
                }
            }
            int temp = a[i];
            a[i] = a[smallest];
            a[smallest] = temp;
        }
    }
    
    

}
