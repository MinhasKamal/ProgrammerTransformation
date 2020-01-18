/// You want everyone to understand your code easily.
/// So, you put some REALLLLY helpful comments. Runtime
/// is cut from n/2 to n/3.

/*
 * checks if a number is prime
*/
int prime_check(int n){
	if (n == 2){ // 2 is prime
		return 1;
	}

	if (n % 2 == 0){ // if divisible by 2 then not prime
		return 0;
	}

	int i = 3; // i is odd
	int lim = n/3;
	for (; i < lim; i += 2){ // check for all odd numbers till n/3
		if (n % i == 0){ // if divisible then not prime
			return 0; // not prime
		}
	}

	return 1; // is prime number
}
