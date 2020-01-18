/// You have improved time complexity from n to √n! BRILLIANT!!!
/// You cover boundary cases too. No room for unreliable codes :)
/// Most importantly, who elite uses tab?!

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
