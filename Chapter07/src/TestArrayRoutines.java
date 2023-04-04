import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestArrayRoutines {

    @Test
    void testSum_Simple() {
        int[] arr = {1, 2, 3, 4, 5};
        int s = ArrayRoutines.sum(arr);
        assertEquals(15, s);
    }
    
    @Test
    void testSum_All_Zeroes() {
        int[] arr = {0, 0, 0, 0, 0, 0, 0};
        int s = ArrayRoutines.sum(arr);
        assertEquals(0, s);
    }
    
    @Test
    void testSum_SingleNumber() {
        int[] arr = {4};
        int s = ArrayRoutines.sum(arr);
        assertEquals(4, s);
    }
    
    @Test
    void testSort_Small() {
        int[] arr = {34, 2, 9, -1, 0, 14};
        int[] expected = {-1, 0, 2, 9, 14, 34};
        ArrayRoutines.sort(arr);
        assertArrayEquals(expected, arr);
    }
    
    @Test
    void testSort_One() {
        int[] arr = {34};
        int[] expected = {34};
        ArrayRoutines.sort(arr);
        assertArrayEquals(expected, arr);
    }
    
    @Test
    void testSort_Null() {
        int[] arr = null;
        assertThrows(IllegalArgumentException.class, 
                      () -> { ArrayRoutines.sort(arr); });
    }
    
    @Test
    void testMaximum_Three() {
        int[] arr = {1, 2, 3};
        assertEquals(3, ArrayRoutines.maximum(arr));
    }
    
    @Test
    void testMaximum_Three_A() {
        int[] arr = {3, 2, 1};
        assertEquals(3, ArrayRoutines.maximum(arr));
    }
    
    @Test
    void testMaximumThree_B() {
        int[] arr = {2, 3, 1};
        assertEquals(3, ArrayRoutines.maximum(arr));
    }
    
    @Test
    void testMaximumAllDups() {
        int[] arr = {3, 3, 3};
        assertEquals(3, ArrayRoutines.maximum(arr));
    }
    
    @Test
    void testMaximumNull() {
        int[] arr = null;
        assertThrows(IllegalArgumentException.class, 
                      () -> { ArrayRoutines.maximum(arr); });
    }
    
    @Test
    void testMaximumAllNegatives() {
        int[] arr = {-3, -13, -1};
        assertEquals(-1, ArrayRoutines.maximum(arr));
    }
    
    @Test
    void testMaximumEmpty() {
        int[] arr = {};
        assertThrows(IllegalArgumentException.class, 
                () -> { ArrayRoutines.maximum(arr); });
    }

}
