package Week3;

public class MultiDimensional {
    static void main(String[] args) {
        int[][] values = {{2, 3, 4}, {4, 5, 6}};
        System.out.println(values[1][1]);
        // 2 3 4
        // 4 5 6
        for (int[] arr : values) {
            for (int val : arr) {
                System.out.print(val + " ");
            }
            System.out.println("");
        }
    }
}
