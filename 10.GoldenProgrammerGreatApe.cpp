/// You simply got over-bored...

bool isPrime(int N, int _=2){
	return _*_>N?1<N:N%_&&isPrime(N,++_);
}
