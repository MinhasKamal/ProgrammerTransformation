/// Execution time is much more important than memory 
/// consumption; and if you can do some pre-processing,
/// then you should. Thus, for small integers, you
/// bring down the complexity from √n to 1!

public class PrimeNumberChecker {

    public static final int MAX_MEMORY_SPACE = 64000000;

    private boolean[] primeNumberMarks;

    public PrimeNumberChecker() {
        this(MAX_MEMORY_SPACE);
    }

    public PrimeNumberChecker(int maxValue) {
        if (maxValue > MAX_MEMORY_SPACE) {
            maxValue = MAX_MEMORY_SPACE;
        }

        this.primeNumberMarks = new boolean[maxValue+1];
        markPrimeNumbers();
    }

    private void markPrimeNumbers() {
        for (int i=0; i<primeNumberMarks.length; ++i) {
            primeNumberMarks[i] = true;
        }
        primeNumberMarks[0] = false;
        primeNumberMarks[1] = false;

        for (int i=0; i*i<primeNumberMarks.length; ++i) {
            if (true == primeNumberMarks[i]) {
                for (int j=i+i; j<primeNumberMarks.length; j+=i) {
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

        for (int factor = 3; factor*factor <= number; factor += 2) {
            if (0 == number%factor) {
                return false;
            }
        }

        return true;
    }
}
