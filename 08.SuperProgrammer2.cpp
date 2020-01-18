/// You have come up with a more clever solution for computing √n.
/// In fact, you don't really need to calculate it.
/// `2 == number` instead of `number == 2` can save you from lots
/// of trouble caused by mistyping one `=`; giving compilation error
/// in place of undetectable bug.

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
