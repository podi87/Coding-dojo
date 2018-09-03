import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

//        int[] hasSearchedNum = new int[]{-1, 2, 3, 4, -5, 6};
//        int[] hasNoSearchedNum = new int[]{1, 2, 3, 4, 6};
//        String brackets1 = "{}()";
//        String brackets2 = "({()})";
//
//        printSearchedNum(hasSearchedNum);
//        printSearchedNum(hasNoSearchedNum);
//
//        // word endsWith vowels
//        final String[] inputWords = new String[]{"baba", "mama", "kakis", "tita"};
//        printWordsWithVowelAtTheEnd(inputWords);
//
//        // increased numbers in array
//        final int[] nums1 = new int[] {1,2,3,4,5,6};
//        final int[] nums2 = new int[] {1,3,4,6};
//        final int[] nums3 = new int[] {1,3,2,7,4};
//        System.out.println(IncreasingNums.isIncreased(nums3));
//
//        // Sum and Factorials of arrays
//        SumAndFactorial.printSumAndFactorial(nums1);
//
//        // Month of biggest income
//        final int[] incomes = new int[] {45, 64, 55, 66, 26, 64, 75, 39, 58, 84, 41, 76};
//        BiggestIncome.printBestMonth(incomes);
//
//        // Binary tree traversing
//        BinaryTree tree = BinaryTree.createTree();
//        tree.traverseInOrder(tree.root);
//        System.out.println();
//        tree.traversePreOrder(tree.root);
//
//        // Sorting an array
//        int[] arr = new int[]{2, 6, 8, 7, 2, 4};
//        System.out.println(Arrays.toString(BubbleSort.bubbleSort(arr)));
//        System.out.println(Arrays.toString(BubbleSort.bubbleSort2(arr)));
//
//        //gnomeSort
//        int[] array = new int[]{3,2,1,8,4,6};
//        System.out.println(Arrays.toString(GnomeSort.stupidSort(array)));
//
//        System.out.println(Fibonacci.fib(6));
//
//        String gf = "greenfox";
//        System.out.println(Fibonacci.reverse(gf));
//
//
//        final int n = 10000000;
//        int[] nums = new int[n];
//        for (int i = 0; i < n; i++) {
//            nums[i] = (int)(Math.random() * (10000)+1);
//        }
//        int[] num2 = nums;
//
//        //IterativeMergeSort
//        IterativeMergeSort iterativeMergeSort = new IterativeMergeSort();
//        int[] ar = new int[]{100,1,24,4,5,6,8};
//        int[] ab = new int[]{3,8,2,5,23,4,6,5,8,9,23,5,6,54,46,46,2,224,7};
//        int[] a = new int[]{5,4,7,9};
//        long start1 = System.currentTimeMillis();
//        iterativeMergeSort.mergeSort(num2);
//        long end1 = System.currentTimeMillis();
//        System.err.println(end1-start1);
//
//        //RecursiveMergeSort
//        RecursiveMergeSort recursiveMergeSort = new RecursiveMergeSort();
//        long start2 = System.currentTimeMillis();
//        recursiveMergeSort.mergeSort(nums);
//        long end2 = System.currentTimeMillis();
//        System.err.println(end2-start2);



    }

    private static void printWordsWithVowelAtTheEnd(final String[] input) {
        final char[] vowels = new char[]{'a', 'e', 'i', 'o', 'u'};
        int count = 0;
        String[] result = new String[]{};

        for (String temp : input) {
            char lastChar = temp.charAt(temp.length() - 1);
            for (char c : vowels) {
                if (c == lastChar) {
                    result = addElement(result, temp);
                    count++;
                }
                break;
            }
        }
        System.out.println(Arrays.toString(result));
        System.out.println(count);
    }

    private static String[] addElement(String[] array, String newWorld) {
        String[] result = Arrays.copyOf(array, array.length + 1);
        result[result.length - 1] = newWorld;
        return result;
    }

    private static void printSearchedNum(int[] hasSearchedNum) {
        int exist = 0;
        int counter = 0;
        while (counter < hasSearchedNum.length - 1 && hasSearchedNum[counter] > 0) {
            counter++;
        }
        if (hasSearchedNum[counter] < hasSearchedNum.length - 1) {
            exist = hasSearchedNum[counter];
            System.out.println(hasSearchedNum[counter]);
        } else
            System.out.println("Not exist");
    }

    private static boolean deque(String input) {
        char[] chars = input.toCharArray();
        Deque<Character> queue = new ArrayDeque<>();
        List<Character> startBraces = Arrays.asList('[', '{', '(');
        Map<Character, Character> braces = new HashMap<Character, Character>() {{
            put(']', '[');
            put(')', '(');
            put('}', '{');
        }};
        for (final char character : chars) {
            if (startBraces.contains(character)) {
                queue.push(character);
            } else if (braces.get(character).equals(queue.peek())) {
                queue.pop();
            } else {
                return false;
            }
        }
        return queue.isEmpty();
    }
}
