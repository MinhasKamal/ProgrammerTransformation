///
///

import java.util.Arrays;

public class PrimeNumberChecker {

    public static final int FIRST_PRIME_NUMBER = 2;
    public static final int MAX_PRE_PROCESSING_LIMIT = 64 * 1000 * 1000;
    public static final int MIN_PRE_PROCESSING_LIMIT = FIRST_PRIME_NUMBER;

    private boolean[] primalityMarks;

    public PrimeNumberChecker() {
        this(MAX_PRE_PROCESSING_LIMIT);
    }

    public PrimeNumberChecker(int preProcessingLimit) {
        if (preProcessingLimit > MAX_PRE_PROCESSING_LIMIT) {
            preProcessingLimit = MAX_PRE_PROCESSING_LIMIT;
        } else if (preProcessingLimit < MIN_PRE_PROCESSING_LIMIT) {
            preProcessingLimit = MIN_PRE_PROCESSING_LIMIT;
        }

        this.primalityMarks = new boolean[preProcessingLimit+1];
        computePrimalityMarks();
    }

    private final void computePrimalityMarks() {
        Arrays.fill(primalityMarks, 0, FIRST_PRIME_NUMBER, false);
        Arrays.fill(primalityMarks, FIRST_PRIME_NUMBER, primalityMarks.length, true);

        int checkingLimit = squareRootFloorForPositiveNumber(primalityMarks.length);
        for (int number = FIRST_PRIME_NUMBER; number <= checkingLimit; number++) {
            if (primalityMarks[number]) {
                for (int multipleOfNumber = number+number; multipleOfNumber < primalityMarks.length; multipleOfNumber += number) {
                    primalityMarks[multipleOfNumber] = false;
                }
            }
        }

        return;
    }

    public final boolean isPrime(int number) {
        if (number < FIRST_PRIME_NUMBER) {
            return false;
        } else if (number < primalityMarks.length) {
            return primalityMarks[number];
        } else {
            return checkPrimalityAfterFirstPrimeNumber(number);
        }
    }

    private final boolean checkPrimalityAfterFirstPrimeNumber (int number) {
        if (isDivisible(number, FIRST_PRIME_NUMBER)) {
            return false;
        }

        int numberSquareRoot = squareRootFloorForPositiveNumber(number);
        for (int factor = FIRST_PRIME_NUMBER+1; factor <= numberSquareRoot; factor += 2) {
            if (isDivisible(number, factor)) return false;
        }

        return true;
    }

    private final int squareRootFloorForPositiveNumber (int number) {
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
                start = middle;
            } else {
                end = middle;
            }
        }
    }
    
    private final boolean isDivisible(int dividend, int divisor) {
        return dividend % divisor == 0;
    }
}
