/// You working on base layer, and don't have the luxury
/// of high level languages or frameworks. So, you build
/// them all by yourself. Your system has a tiny memory
/// and weak processing power. Moreover you, also don't
/// have support for code optimization.

#include <malloc.h>
#include <string.h>

int isPrime (int number);
void _init ();
void _initWithLimit (int preProcessingLimit);
void _computePrimalityMarks ();
int _checkPrimality (int number);
int _calculateSquareRoot (int number);

static const int TRUE = 1;
static const int FALSE = 0;
static const int ZERO = 0;
static const int FIRST_PRIME_NUMBER = 2;
static const int MAX_PRE_PROCESSING_LIMIT = 8 * 1000* 1000;
static const int MIN_PRE_PROCESSING_LIMIT = 2;

char* _primalityMarks;
int _primalityMarksLength = 0;

int isPrime (int number) {
    static int firstRun = 1;
    if(firstRun){
        _init();
        firstRun = FALSE;
    }

    if (FIRST_PRIME_NUMBER > number) {
        return FALSE;
    } else if (_primalityMarksLength > number) {
        return _primalityMarks[number];
    } else {
        return _checkPrimality(number);
    }
}

void _init () {
    _initWithLimit(MAX_PRE_PROCESSING_LIMIT);
}

void _initWithLimit (int preProcessingLimit) {
    if (MAX_PRE_PROCESSING_LIMIT < preProcessingLimit) {
        preProcessingLimit = MAX_PRE_PROCESSING_LIMIT;
    } else if (MIN_PRE_PROCESSING_LIMIT > preProcessingLimit) {
        preProcessingLimit = MIN_PRE_PROCESSING_LIMIT;
    }

    _primalityMarksLength = preProcessingLimit;
    _primalityMarks = (char*) malloc(_primalityMarksLength);//new boolean[preProcessingLimit+1];

    _computePrimalityMarks();

    return;
}

void _computePrimalityMarks () {
    memset(_primalityMarks, TRUE, _primalityMarksLength);
    _primalityMarks[0] = FALSE;
    _primalityMarks[1] = FALSE;

    register int checkLimit = _calculateSquareRoot(_primalityMarksLength);
    for (register int number = FIRST_PRIME_NUMBER; number < checkLimit; ++number) {
        if (TRUE == _primalityMarks[number]) {
            for (register int multipleOfNumber = number*2; multipleOfNumber < _primalityMarksLength; multipleOfNumber += number) {
                _primalityMarks[multipleOfNumber] = FALSE;
            }
        }
    }

    return;
}

int _checkPrimality (int number) {
    if (ZERO == number%FIRST_PRIME_NUMBER) {
        return FALSE;
    }

    register int numberSquareRoot = _calculateSquareRoot(number);
    for (register int factor = FIRST_PRIME_NUMBER+1; factor <= numberSquareRoot; factor += 2) {
        if (ZERO == number%factor) {
            return FALSE;
        }
    }

    return TRUE;
}

int _calculateSquareRoot (int number) {
    if (ZERO >= number) {
        return ZERO;
    }

    int start = 1;
    int middle;
    int end = number;
    int squareRoot = start;
    while (TRUE) {
        middle = (start + end) / 2;

        if (squareRoot == middle) {
            return squareRoot;
        }
        squareRoot = middle;

        if (squareRoot <= number/squareRoot) {
            start = squareRoot;
        } else {
            end = squareRoot;
        }
    }
}

#include <stdio.h>
int main () {
    //init0();
    //init(500);
    printf("%d", isPrime(-5));
    printf("%d", isPrime(-1));
    printf("%d", isPrime(0));
    printf("%d\n", isPrime(1));
    printf("%d", isPrime(2));
    printf("%d", isPrime(11));
    printf("%d\n", isPrime(13));
    printf("%d", isPrime(119));
    printf("%d\n", isPrime(121));
    printf("%d", isPrime(991));
    printf("%d\n", isPrime(102001));

    return 0;
}
