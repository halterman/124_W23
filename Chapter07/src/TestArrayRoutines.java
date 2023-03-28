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

}
