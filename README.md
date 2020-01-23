# ProgrammerTransformation
#### The Journey of *Homo Programmer*
So, you have fallen love at the very first sight! And, thank god, it is not one of those *Homo sapienses*. It is rather a species from a completely differently kingdom- ***Machinia***.


## Assignment:
Write a program that tells if an integer is prime or not.


## The Journey:
Welcome to your grand entrance in the startling universe of computer programming. Done with the "hallo world", you are now ready to dominate this infinite cosmos of bits.


### 01. [Base Programmer](01.BaseProgrammer.c)
Though you knew how prime number worked, it took a long time to come up with this logic. Also, You made several mistakes on the way. And now, you are proud of your brilliant solution.

``` BaseProgrammer.c
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
```

### 02. [Programmer Kaioken x4](02.ProgrammerKaioken4.c)
You have learned to use flag, and think that- it is the coolest. Also, indentation is super important!

``` ProgrammerKaioken4.c
int pri_num(int a) {
	int i = 0, f = 0;
	for (i = 2; i < a; i ++)
		if (a % i == 0) f = 1;

	if (f == 0) return 1;
	else return 0;
}
```

### 03. [Programmer Kaioken x10](03.ProgrammerKaioken10.c)
You don't need to calculate all the way to the end, finding one divisor is enough. So, just `return`, no need for 'flag'. `break` would do too, but `return` is better.

``` ProgrammerKaioken10.c
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
```

### 04. [Programmer Kaioken x20](04.ProgrammerKaioken20.c)
You have grown SMARTER, and halved the run time by checking divisibility with odd-numbers only. You also understand that looping till 'x/2' is enough.

``` ProgrammerKaioken20.c
int prime_or_not(int x) {
	if (x == 2) {
		return 1;
	}

	if (x % 2 == 0) {
		return 0;
	}

	int i;
	for (i = 3; i < x/2; i += 2) {
		if (x % i == 0){
			return 0;
		}
	}

	return 1;
}
```

### 05. [Programmer Great Ape](05.ProgrammerGreatApe.c)
You want everyone to understand your code easily. So, you put some *REALLLLY* helpful comments. Runtime is cut from 'n/2' to 'n/3'.

``` ProgrammerGreatApe.c
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
```

### 06. [Pseudo Super Programmer](06.PseudoSuperProgrammer.cpp)
You understand that, mere comment cannot make bad code look good. So, you get rid of those crappy names plus annoying comments, and make the code truly readable.

``` PseudoSuperProgrammer.cpp
bool primeNumberChecker(int number){

	if (number == 2){
		return true;
	}

	if (number % 2 == 0){
		return false;
	}

	int limit = number/3;
	for (int factor = 3; factor < limit; factor += 2){
		if (number % factor == 0){
			return false;
		}
	}

	return true;
}
```

### 07. [Super Programmer](07.SuperProgrammer.cpp)
You have improved time complexity from 'n' to '√n'! BRILLIANT!!! You cover boundary cases too. No room for unreliable codes :) <br>
*Most importantly, who elite uses tab?!*

``` SuperProgrammer.cpp
#include <math.h>

bool checkPrime(int number) {
    if (number < 2) {
        return false;
    }
    if (number == 2) {
        return true;
    }
    if (number % 2 == 0) {
        return false;
    }

    int limit = sqrt(number);
    for (int factor = 3; factor <= limit; factor += 2) {
        if (number % factor == 0) {
            return false;
        }
    }

    return true;
}
```

### 08. [Super Programmer 2](08.SuperProgrammer2.cpp)
You have come up with a more clever solution for computing '√n'. In fact, you don't really need to calculate it. <br>
`2 == number` instead of `number == 2` can save you from lots of trouble caused by mistyping one `=`; giving compilation error in place of undetectable bug.

``` SuperProgrammer2.cpp
bool isPrime (int number) {
    if (2 == number) {
        return true;
    }
    if (2 > number || 0 == number%2) {
        return false;
    }

    for (int factor = 3; factor*factor <= number; factor += 2) {
        if (0 == number%factor) {
            return false;
        }
    }

    return true;
}
```

### 09. [Super Programmer 3](09.SuperProgrammer3.cpp)

``` SuperProgrammer3.cpp
bool isPrime (int number) {
    if (3 >= number) {
        if (2 > number) {
            return false;
        }
        return true;
    }

    if (0 == (number&1) || 0 == (number%3)) {
        return false;
    }

    int factor = 5;
    while (factor*factor <= number) {
        if (0 == number%factor) {
            return false;
        }
        factor += 2;

        if (0 == number%factor) {
            return false;
        }
        factor += 4;
    }

    return true;
}
```

### 10. [Golden-Programmer-Great-Ape](10.GoldenProgrammerGreatApe.cpp)
You simply got over-bored...

``` GoldenProgrammerGreatApe.cpp
bool isPrime(int N, int _=2){
	return _*_>N?1<N:N%_&&isPrime(N,++_);
}
```

### 11. [Super Programmer 4](11.SuperProgrammer4.java)
u don't give a **f\*$%**

``` PrimeNumberChecker.java
public class PrimeNumberChecker {
    public boolean isPrime(int n) {
        return n>1?!new String(new char[n]).matches(".?|(..+?)\\1+"):false;
    }
}
```

### 12. [Super Programmer God](12.SuperProgrammerGod.java)

``` PrimeNumberChecker.java
public class PrimeNumberChecker {

    public static final int MAX_MEMORY_SPACE = 64000000;
    public static final int MIN_MEMORY_SPACE = 4;

    private boolean[] primeNumberMarks;

    public PrimeNumberChecker() {
        this(MAX_MEMORY_SPACE);
    }

    public PrimeNumberChecker(int maxValue) {
        if (MAX_MEMORY_SPACE < maxValue) {
            maxValue = MAX_MEMORY_SPACE;
        } else if (MIN_MEMORY_SPACE > maxValue) {
            maxValue = MIN_MEMORY_SPACE;
        }

        this.primeNumberMarks = new boolean[maxValue+1];
        markPrimeNumbers();
    }

    private void markPrimeNumbers() {
        for (int i = 2; i < primeNumberMarks.length; ++i) {
            primeNumberMarks[i] = true;
        }

        for (int i = 2; i*i <= primeNumberMarks.length; ++i) {
            if (true == primeNumberMarks[i]) {
                for (int j = i+i; j < primeNumberMarks.length; j += i) {
                    primeNumberMarks[j] = false;
                }
            }
        }

        return;
    }

    public boolean isPrime(int number) {
        if (number < 0) {
            return false;
        } else if (number < primeNumberMarks.length) {
            return primeNumberMarks[number];
        } else {
            return checkPrime(number);
        }
    }

    private boolean checkPrime (int number) {
        if (0 == (number%2) || 0 == (number%3)) {
            return false;
        }

        int factor = 5;
        while (factor*factor <= number) {
            if (0 == number%factor) {
                return false;
            }
            factor += 2;

            if (0 == number%factor) {
                return false;
            }
            factor += 4;
        }

        return true;
    }
}
```

### 13. [Super Programmer God Blue](#)
### 14. [Super Programmer Blue Kaioken](#)
### 15. [Programmer Ultra Instinct](#)


## License
<a rel="license" href="https://opensource.org/licenses/MIT"><img alt="MIT License" src="https://cloud.githubusercontent.com/assets/5456665/18950087/fbe0681a-865f-11e6-9552-e59d038d5913.png" width="60em" height=auto/></a><br/><a href="https://github.com/MinhasKamal/ProgrammerTransformation">ProgrammerTransformation</a> is licensed under <a rel="license" href="https://opensource.org/licenses/MIT">MIT License</a>.
