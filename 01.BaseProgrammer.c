/// Though u knew how prime number works (of course u r good @ math),
/// it took a long time to come up with the logic. Also, u made several
/// mistakes on the way. And now, u are proud of ur brilliant solution.
/// YES!!!

int func(int a)   
{ 
int x,i, r;
	x = 0;
	i = 0 ;
for(i=1; i<=a ; i=i+1 )
	{
	if(a%i == 0)
	{x=x+1 ;}
	}
if( x == 2)
	{r =  1;}
else
	{r = 0;}
        return r ;  

}
