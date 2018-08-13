public class Fibonacci {

    static int fib(int n) {
        if (n == 0) {
            return 0;
        }
        else if(n < 2) {
            return n;
        }
        return fib(n-2) + fib(n-1);
    }

    static String reverse (String word) {
        if (word.length() > 1) {
            String lastChar = word.substring(word.length()-1 , word.length());
            String remained = word.substring(0, word.length()-1);
            return lastChar + reverse(remained);
        }
        return word;
    }
}
