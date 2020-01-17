/// You don't need to calculate all the way to the end, finding one divisor
/// is enough. So, just 'return', no need for 'flag'. 'break' would work too,
/// but 'return' is better.

int prime_num(int x){
	int i = 2;
	while (i < x){
		if (x % i == 0){
			return 0;
		}
		i++;
	}

	return 1;
}
