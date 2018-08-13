public class GnomeSort {

    static int[] stupidSort(int[] array) {
        int temp = 0;
        for (int i = 0; i + 1 < array.length; ) {
            if (array[i] > array[i + 1]) {
                temp = array[i + 1];
                array[i + 1] = array[i];
                array[i] = temp;
                if (i == 0) {
                    i++;
                } else {
                    i = i - 1;
                }
            } else {
                i++;
            }
        }
        return array;
    }
}
