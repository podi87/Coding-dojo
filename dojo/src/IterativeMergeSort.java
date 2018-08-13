public class IterativeMergeSort {

    public int[] mergeSort(int[] array) {
        int subArrayLength = 1;
        int[][] result = createInitialArray(array, subArrayLength);
        while (result.length > 1) {
            result = createTempArray(result);
        }
        return result[0];
    }

    private int[][] createInitialArray(int[] array, int n) {
        int[][] arr = new int[array.length][n];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = array[i];
            }
        }
        return arr;
    }

    private int[][] createTempArray(int[][] array) {
        int[][] tempArray;
        if (array.length % 2 == 0) {
            tempArray = new int[array.length / 2][];
        } else {
            tempArray = new int[(array.length / 2) + 1][];
        }

        int arrayIndex = 0;
        for (int i = 0; i + 1 < array.length; ) {
            tempArray[arrayIndex] = mergeAndSortTwoArray(array[i], array[i + 1]);
            arrayIndex++;
            i = i + 2;
            if (i == array.length - 1) {
                tempArray[arrayIndex] = array[i];
            }
        }
        return tempArray;
    }


    private int[] mergeAndSortTwoArray(int[] a, int[] b) {
        int[] mergedArray = new int[a.length + b.length];

        int i = 0;
        int j = 0;
        int arrayIndex = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                mergedArray[arrayIndex] = a[i];
                arrayIndex++;
                i++;
            } else {
                mergedArray[arrayIndex] = b[j];
                arrayIndex++;
                j++;
            }
        }

        while (i < a.length) {
            mergedArray[arrayIndex] = a[i];
            arrayIndex++;
            i++;
        }
        while (j < b.length) {
            mergedArray[arrayIndex] = b[j];
            arrayIndex++;
            j++;
        }
        return mergedArray;
    }

}