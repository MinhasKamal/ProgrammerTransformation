/// You simply got over-bored...

bool isPrime(int n, int _=2) {
    return _*_>n?:n%_&&isPrime(n,++_);
}
