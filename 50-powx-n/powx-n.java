class Solution {
    public double myPow(double x, int n) {
        long N = n;
        if (N<0) return 1/myPower(x,-N);
        return myPower(x,n);
    }
    public double myPower(double x, long n) {
    if (n == 0) return 1;
    if (n%2 == 0) return myPower(x*x, n/2);
    return x*myPower(x,n-1);
    }
}