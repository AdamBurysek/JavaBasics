package Types;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {
        /* older syntax */
        int[][] numbers = new int[2][3];

        numbers[0][0] = 1;

        System.out.println(Arrays.deepToString(numbers));

        /* newer syntax */
        int[][] anotherNumbers = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(Arrays.deepToString(anotherNumbers));
    }
}
