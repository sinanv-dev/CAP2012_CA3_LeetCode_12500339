class LC509_FibonacciNumber_Easy {
    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int previous = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            int next = previous + current;
            previous = current;
            current = next;
        }
        return current;
    }
}
