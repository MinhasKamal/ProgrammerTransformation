/// You have come up with a more clever solution for
/// computing √n. In fact, you don't really need to
/// calculate it.

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
