///
///

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
