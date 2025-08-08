package Types;

public class Arrays {
    public static void main(String[] args) {
        /* Arrays have fixed length */
        /* older syntax */
        int[] numbers = new int[5];
        numbers[0] = 1;
        numbers[1] = 2;

        System.out.println(java.util.Arrays.toString(numbers));

        /* newer syntax */
        int[] anotherNumbers = {2, 3, 5, 1, 4};
        java.util.Arrays.sort(anotherNumbers);

        System.out.println(java.util.Arrays.toString(anotherNumbers));
    }
}
