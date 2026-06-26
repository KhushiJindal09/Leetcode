class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] prime = new int[n+1];
        for(int i = 0; i<n; i++) {
            prime[i] = 1;
        }
        prime[0]=0;
        prime[1]= 0;
        for(int i = 2; i*i <= n; i++) {
            if(prime[i] == 1) {
                for(int j=i*i; j<n; j+=i) {
                    prime[j] = 0;
                }
            }
        }
        for(int i = 2; i <= n/2; i++){
            if(prime[i] == 1 && prime[n-i] == 1){
                ans.add(Arrays.asList(i,n-i));
            }
        }
        return ans;
    }
}