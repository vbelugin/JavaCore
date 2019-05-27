package org.globallogic.tasks;

public class ArrayTask {

    /* Write implementation of method. The method get int array, should return input array in reverse order.
    Example: Input array [1, 2, 8, 23, 5] Output array: [5, 23, 8, 2, 1]
     */
    public int[] reverseArray(int[] arr) {
        int[] rev = new int[arr.length];
        for ( int i = 0, max = arr.length - 1; i < arr.length; i++, max--) {
            rev[i] = arr[max];
        }
        return rev;
    }

    /* Write implementation of method. The method should return sum of elements
    that placed on odd index positions (e.g. 1, 3, 5 etc.) of input array. For empty array sum will be 0
     */
    public int sumOfOddIndexElements(int[] arr) {
        int sum = 0;
        for (int i = 1; i < arr.length; i += 2) {
            sum += arr[i];
        }
        return sum;
    }
}

