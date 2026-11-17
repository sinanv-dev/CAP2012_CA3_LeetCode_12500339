
class Solution {
    public int countDigitOne(int n) {
        long count = 0;

        for (long i = 1; i <= n; i *= 10) {
            long divider = i * 10;

            count += (n / divider) * i;

            count += Math.min(
                Math.max((long) n % divider - i + 1, 0L),
                i
            );
        }

        return (int) count;
    }
}
