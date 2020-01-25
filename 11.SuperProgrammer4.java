/// u don't give a f*$%
/// Explanation: https://stackoverflow.com/questions/2795065/how-to-determine-if-a-number-is-a-prime-with-regex

public class PrimeNumberChecker {
    public boolean isPrime(int n) {
        return n>1? !new String(new char[n]).matches(".?|(..+?)\\1+"): false;
    }
}
