/// Execution time is much more important than memory 
/// consumption; and if you can do some pre-processing,
/// then you should. Thus, for small integers, you
/// bring down the complexity from √n to 1!
/// You also know why `i > j/i` is better than `i*i > j`.

public class PrimeNumberChecker {

    public static final int MAX_MEMORY_SPACE = 64000000;
    public static final int MIN_MEMORY_SPACE = 4;

    private boolean[] primeNumberMarks;

    public PrimeNumberChecker() {
        this(MAX_MEMORY_SPACE);
    }

    public PrimeNumberChecker(int maxValue) {
        if (MAX_MEMORY_SPACE < maxValue) {
            maxValue = MAX_MEMORY_SPACE;
        } else if (MIN_MEMORY_SPACE > maxValue) {
            maxValue = MIN_MEMORY_SPACE;
        }

        this.primeNumberMarks = new boolean[maxValue+1];
        markPrimeNumbers();
    }

    private void markPrimeNumbers() {
        for (int i = 2; i < primeNumberMarks.length; ++i) {
            primeNumberMarks[i] = true;
        }

        for (int i = 2; i < primeNumberMarks.length/i; ++i) {
            if (true == primeNumberMarks[i]) {
                for (int j = i+i; j < primeNumberMarks.length; j += i) {
                    primeNumberMarks[j] = false;
                }
            }
        }

        return;
    }

    public boolean isPrime(int number) {
        if (number < 0) {
            return false;
        } else if (number < primeNumberMarks.length) {
            return primeNumberMarks[number];
        } else {
            return checkPrime(number);
        }
    }

    private boolean checkPrime (int number) {
        if (0 == number%2) {
            return false;
        }

        for (int factor = 3; factor <= number/factor; factor += 2) {
            if (0 == number%factor) {
                return false;
            }
        }

        return true;
    }
}
