/// You have learned to use flag, and think
/// that- it is the coolest.

int func_pri_num(int a){
	int i, f = 0;
	for (i = 2; i < a; i++)
		if (a % i == 0) f = 1;
	
	if (f == 0) return 1;
	else return 0;
}
