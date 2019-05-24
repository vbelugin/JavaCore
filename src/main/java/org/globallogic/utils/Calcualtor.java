package org.globallogic.utils;

public class Calcualtor {
    public static double calcPi(int n) {
        int div = 1;
        double numerator = 4;
        double pi = 0.0;
        for (int i = 0; i < n; i++) {
            pi += numerator/div;
            div += 2;
            numerator *= (-1);
        }
        return pi;
    }

    private static double getIter(int div) {
        return 4.0/div;
    }

}
