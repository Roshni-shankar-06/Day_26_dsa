class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        
        boolean[] isPrime = new boolean[n];
        // Initialize all indices from 2 to n-1 as true
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }
        
        // Loop up to the square root of n
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                // Mark multiples of i starting from i*i as non-prime
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) count++;
        }
        
        return count;
    }
}
