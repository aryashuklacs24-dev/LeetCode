class Solution {
    public long countCommas(long n) {

        long comma = 0;
        long place = 1000;

        while (place <= n) {
            comma = comma + (n - place + 1);
            place = place * 1000;
        }

        return comma;
    }
}