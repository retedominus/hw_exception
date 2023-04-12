import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] firstArray = new int[]{3, 6, 22, 67, 3, 25, 78, 0};
        int[] secondArray = new int[]{6, 3, 8, 9, 5, 6, 4, 23};
        int[] otherArray = new int[]{1, 15, 9, 5, 7, 4, 34};
        int[] nullArray = null;

        System.out.println(Arrays.toString(subArray(firstArray, secondArray)));
//        System.out.println(Arrays.toString(subArray(otherArray, secondArray)));
        System.out.println(Arrays.toString(divArray(firstArray, secondArray)));
    }

    private static int[] subArray(int[] arg1, int[] arg2) {
        if (arg1 != null && arg2 != null) {
            int[] result = new int[arg1.length];
            if (arg1.length != arg2.length) {
                throw new RuntimeException("Arrays length must be equal");
            } else {
                for (int i = 0; i < arg1.length; i++) {
                    result[i] = arg1[i] - arg2[i];
                }
            }
            return result;
        } else {
            throw new RuntimeException("Array cannot be null");
        }
    }

    private static int[] divArray(int[] arg1, int[] arg2) {
        if (arg1 != null && arg2 != null) {
            int[] result = new int[arg1.length];
            if (arg1.length != arg2.length) {
                throw new RuntimeException("Arrays length must be equal");
            } else {
                for (int i = 0; i < arg1.length; i++) {
                    try {
                        result[i] = arg1[i] / arg2[i];
                    } catch (ArithmeticException exception) {
                        throw new RuntimeException("Division by zero is not supported");
                    }
                }
            }
            return result;
        } else {
            throw new RuntimeException("Array cannot be null");
        }
    }
}