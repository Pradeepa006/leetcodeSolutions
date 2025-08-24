class Solution {
    public double myPow(double x, int n) {
        double r = 1.00000;
        long b = n;
        if(b < 0){
            x = 1 / x ;
            b = -b;
        }
        if(x == 1.00000){
            return 1.00000;
        }

        while (b > 0) {
            if (b % 2 == 1) {   // if b is odd
                r = r * x;
            }
            x = x * x;          // square the base
            b = b / 2;          // divide exponent by 2
        }
        return r ;
    }
}