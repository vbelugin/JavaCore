package org.globallogic.tasks;

public class Pyramid {
    public static void printPyramid(int h) {
        int lineSize = 1;
        for (int i = 0; i < h; i++) {
            if (lineSize == 1) {
                System.out.print(lineSize);
            }
            for (int j = 0, k = lineSize/2; k > 0;) {
                if (j <= lineSize/2) {
                    System.out.print(++j);
                } else {
                    System.out.print(k--);
                }
            }
            System.out.println();
            lineSize+=2;
        }
    }
}
