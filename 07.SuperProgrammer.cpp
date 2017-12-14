/// You check boundary cases too.
/// No room for unreliable codes :)

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

	for (int limit = number/3, factor = 3; factor < limit; factor += 2) {
		if (number % factor == 0) {
			return false;
		}
	}

	return true;
}
