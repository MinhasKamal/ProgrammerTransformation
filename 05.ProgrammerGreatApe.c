/// You wish that, others may understand your code.
/// So, you put some REALLLLY helpful comments.

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

	int i = 3; // i is odd number
	int l = n/3;
	for (; i < l; i += 2){ // check for all odd numbers till n/3; increase i by 2
		if (n % i == 0){ // if divisible by a number then not prime
			return 0; // not prime
		}
	}

	return 1; // prime number
}
