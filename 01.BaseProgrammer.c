/// It took a long time to come up with this solution.
/// You made several mistakes at the beginning. But now,
/// you are proud of your code.

int func (int a)
{
	int x,i,r;
	x=0;
	i=0;
	for (i=1; i<=a; i=i+1)
	{
		if (a%i==0)
			x=x+1;
	}
	if (x==2)
		r=1;
	else
		r=0;
	return r;
}
