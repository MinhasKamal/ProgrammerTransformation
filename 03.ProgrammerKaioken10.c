/// Now, you are smart enough not to use flag;
/// making the code a little bit more efficient.
/// You could use break with flag, but return is
/// better.

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
