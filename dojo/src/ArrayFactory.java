import java.util.Arrays;

public class ArrayFactory {
    static String[] addElement(String[] array, String newWorld) {
        String[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = newWorld;
        return result;
    }
    static int[] addElement(int[] array, int newNum) {
        int[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = newNum;
        return result;
    }
}
