public class BiggestIncome {

    static void printBestMonth(final int[] incomes) {
        int biggestDiff = 0;
        int month = 0;
        for (int i = 1; i < incomes.length; i++) {
            if(incomes[i] - incomes[i-1] > biggestDiff) {
                biggestDiff = incomes[i] - incomes[i-1];
                month = i+1;
            }
        }
        System.out.println(month);
    }
}
