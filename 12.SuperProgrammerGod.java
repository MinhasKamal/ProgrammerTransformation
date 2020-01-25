/// Execution time is more important than memory consumption.
/// And if you can do some preprocessing then you should.
/// Thus, for smaller integers you have reduced the complexity
/// from √n to 1.

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

        for (int i = 2; i*i <= primeNumberMarks.length; ++i) {
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
        if (0 == (number%2) || 0 == (number%3)) {
            return false;
        }

        int factor = 5;
        while (factor*factor <= number) {
            if (0 == number%factor) {
                return false;
            }
            factor += 2;

            if (0 == number%factor) {
                return false;
            }
            factor += 4;
        }

        return true;
    }
}