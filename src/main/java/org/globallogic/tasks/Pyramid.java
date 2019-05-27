package org.globallogic.tasks;

import java.util.stream.IntStream;

public class Pyramid {
    public static void printPyramid(int h) {
        int lineSize = 1;
        for (int i = 0; i < h; i++) {
            addSpaces(lineSize, getMaxSize(h));
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
            addSpaces(lineSize, getMaxSize(h));
            System.out.println();
            lineSize+=2;
        }
    }

    private static int getMaxSize(int height) {
        final int[] max = {1};
        IntStream.range(1, height).forEach(i -> max[0] += 2);
        return max[0];
    }

    private static void addSpaces(int lineSize, int maxSize) {
        int spaceCount = (maxSize - lineSize) / 2;
        IntStream.range(0, spaceCount).forEach(i -> System.out.print(" "));
    }
}
