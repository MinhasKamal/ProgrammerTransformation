/// You understand that, mere comment cannot make bad code look good.
/// So, you get rid of those crappy names and comments, and make the
/// code truly readable.

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
