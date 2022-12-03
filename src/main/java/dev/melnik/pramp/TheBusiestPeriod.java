package dev.melnik.pramp;

public class TheBusiestPeriod {
    private static final int EXIT_TYPE = 0;
    private static final int ENTRANCE_TYPE = 1;

    public static int busiestTimeInTheMall(int[][] data) {
        if (data.length == 1) {
            return data[0][0];
        }
        int currentAmountOfVisitors = data[0][1];
        int maxAmountOfVisitors = currentAmountOfVisitors;
        int busiestPeriod = data[0][0];
        for(int i = 1; i < data.length; i++) {
            int[] currentData = data[i];

            if (currentData[2] == ENTRANCE_TYPE) {
                currentAmountOfVisitors += currentData[1];
            } else {
                currentAmountOfVisitors -= currentData[1];
            }

            if (maxAmountOfVisitors < currentAmountOfVisitors) {
                maxAmountOfVisitors = currentAmountOfVisitors;
                busiestPeriod = currentData[0];
            }
        }
        return busiestPeriod;
    }

    public static void main(String[] args) {
        int[][] example = new int[][]{
                {1487799425, 14, 1},
                {1487799425, 4, 0},
                {1487799425, 2, 0},
                {1487800378, 10, 1},
                {1487801478, 18, 0},
                {1487801478, 18, 1},
                {1487901013, 1, 0},
                {1487901211, 7, 1},
                {1487901211, 7, 0}
        };

        System.out.println("Result: " + busiestTimeInTheMall(example));
    }
}
