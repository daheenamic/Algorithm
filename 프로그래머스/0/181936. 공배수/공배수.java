class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        
        if (number % n == 0 && number % m == 0) {
            answer = 1;
        }
        
        return answer;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        int number = 60;
        int n = 2;
        int m = 3;
        
        System.out.println(s.solution(number, n, m));
    }
}