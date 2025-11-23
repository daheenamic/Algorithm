class Solution {
    public int solution(int n) {
        int sum1 = 0;
        int sum2 = 0;
        
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum2 += i * i;
            } else {
                sum1 += i;
            }
        }
        return n % 2 == 0 ? sum2 : sum1; 
    }
}