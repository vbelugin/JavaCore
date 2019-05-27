package org.globallogic.tasks;

public class Math {
    private static final double PI = 3.14;

    public static int findMin(int[] arr) {
        int min = arr[0];
        for(int n : arr) {
            if (n < min) {
                min = n;
            }
        }
        return min;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for(int n : arr) {
            if (n > max) {
                max = n;
            }
        }
        return max;
    }

    public static double areaOfCircle(int radius) {
        return PI*pow(radius, 2);
    }

    private static int pow(int base, int power) {
        int result = base;
        for (int p = 0; p < power; p++) {
            result *= base;
        }
        return result;
    }
}
