/**
Return n-th element of Fibonacci's sequence
(https://en.wikipedia.org/wiki/Fibonacci_number). Example:
Task04.fib(4) == 3
*/

package groovylab

class Task04{
    public static int fib(int n) {
        switch (n) {
        case 1..2: 1; break
        default: n = fib(n-1) + fib(n-2); break }
    }
}

