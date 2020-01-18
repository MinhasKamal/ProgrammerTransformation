/// u don't give a f*$%

public class PrimeNumberChecker {
    public boolean isPrime(int n) {
        return n>1?!new String(new char[n]).matches(".?|(..+?)\\1+"):false;
    }
}
