import java.util.Arrays;

/// 

public class PrimeNumberChecker {

    public static final int ZERO = 0;
    public static final int FIRST_PRIME_NUMBER = 2;
    public static final int MAX_PRE_PROCESSING_LIMIT = 64 * 1000 * 1000;
    public static final int MIN_PRE_PROCESSING_LIMIT = FIRST_PRIME_NUMBER;

    private boolean[] primalityMarks;

    public PrimeNumberChecker() {
        this(MAX_PRE_PROCESSING_LIMIT);
    }

    public PrimeNumberChecker(int preProcessingLimit) {
        if (MAX_PRE_PROCESSING_LIMIT < preProcessingLimit) {
            preProcessingLimit = MAX_PRE_PROCESSING_LIMIT;
        } else if (MIN_PRE_PROCESSING_LIMIT > preProcessingLimit) {
            preProcessingLimit = MIN_PRE_PROCESSING_LIMIT;
        }

        this.primalityMarks = new boolean[preProcessingLimit+1];

        computePrimalityMarks();
    }

    private final void computePrimalityMarks() {
        Arrays.fill(primalityMarks, ZERO, FIRST_PRIME_NUMBER, false);
        Arrays.fill(primalityMarks, FIRST_PRIME_NUMBER, primalityMarks.length, true);

        int checkLimit = calculateSquareRoot(primalityMarks.length);
        for (int number = FIRST_PRIME_NUMBER; number < checkLimit; ++number) {
            if (true == primalityMarks[number]) {
                for (int multipleOfNumber = number*2; multipleOfNumber < primalityMarks.length; multipleOfNumber += number) {
                    primalityMarks[multipleOfNumber] = false;
                }
            }
        }

        return;
    }

    public boolean isPrime(int number) {
        if (ZERO > number) {
            return false;
        } else if (primalityMarks.length > number) {
            return primalityMarks[number];
        } else {
            return checkPrimality(number);
        }
    }

    private final boolean checkPrimality (int number) {
        if (ZERO == number%FIRST_PRIME_NUMBER) {
            return false;
        }

        int numberSquareRoot = calculateSquareRoot(number);
        for (int factor = FIRST_PRIME_NUMBER+1; factor <= numberSquareRoot; factor += 2) {
            if (ZERO == number%factor) {
                return false;
            }
        }

        return true;
    }

    private final int calculateSquareRoot (int number) {
        if (ZERO >= number) {
            return ZERO;
        }

        int start = 1;
        int middle;
        int end = number;
        int squareRoot = start;
        while (true) {
            middle = (start + end) / 2;

            if (squareRoot == middle) {
                return squareRoot;
            }
            squareRoot = middle;

            if (squareRoot <= number/squareRoot) {
                start = squareRoot;
            } else {
                end = squareRoot;
            }
        }
    }
}
