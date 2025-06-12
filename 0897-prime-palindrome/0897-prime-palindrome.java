class Solution {
    public int primePalindrome(int n) {
        while (true) {
            if (prime(n)  && palindrome(n))
                return n;

            if(10_000_000 < n && n < 100_000_000)
                n = 100_000_000;
            n++;
        }
    }

    public boolean prime(int n) {
       if (n < 2)
        return false;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public boolean palindrome(int n) {
        int rev = 0;
        int copy = n;

        if (n < 10)
            return true;

        while (n != 0) {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev == copy;
    }
}
