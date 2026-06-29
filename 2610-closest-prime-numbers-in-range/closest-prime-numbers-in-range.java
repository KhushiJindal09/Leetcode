class Solution {

    public int[] closestPrimes(int left, int right) {
        boolean[] prime = new boolean[right + 1];
        Arrays.fill(prime, true);
        if (right >= 0) prime[0] = false;
        if (right >= 1) prime[1] = false;
        for (int i = 2; i * i <= right; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= right; j += i) {
                    prime[j] = false;
                }
            }
        }

        int previousPrime = -1;
        int minDifference = Integer.MAX_VALUE;
        int[] answer = {-1, -1};
        for (int i = left; i <= right; i++) {
            if (prime[i]) {
                if (previousPrime != -1) {
                    int difference = i - previousPrime;
                    if (difference < minDifference) {
                        minDifference = difference;
                        answer[0] = previousPrime;
                        answer[1] = i;
                    }
                }
                previousPrime = i;
            }
        }
        return answer;
    }
}