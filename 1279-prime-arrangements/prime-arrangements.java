class Solution {
    long MOD = 1000000007;
    public int numPrimeArrangements(int n) {
        // Step 1: Count prime numbers
        int primeCount = countPrime(n);
        // Step 2: Count non-prime numbers
        int nonPrime = n - primeCount;
        // Step 3: Calculate answer
        long ans = (factorial(primeCount) * factorial(nonPrime)) % MOD;
        return (int) ans;
    }

    // Function to count prime numbers using Sieve
    public int countPrime(int n) {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);
        if (n >= 0) prime[0] = false;
        if (n >= 1) prime[1] = false;
        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i <= n; i++) {
            if (prime[i]) {
                count++;
            }
        }
        return count;
    }
    // Function to calculate factorial
    public long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = (fact * i) % MOD;
        }
        return fact;
    }
}