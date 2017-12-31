/// You improve time complexity from n to √n!
/// You have truly become smart now.

#include <math.h>

bool isPrime(int number) {
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
