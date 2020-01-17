/// You have learned to use flag, and think
/// that- it is the coolest. Also, indentation
/// is super important!

int pri_num(int a) {
	int i = 0, f = 0;
	for (i = 2; i < a; i ++)
		if (a % i == 0) f = 1;

	if (f == 0) return 1;
	else return 0;
}
