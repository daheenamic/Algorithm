class Solution {
    public int solution(int a, int b) {    
        int n = Integer.parseInt(a + "" + b);
        int m = 2 * a * b;
        return Math.max(n, m);
    }
    
    public static void main(String[] args) {
        int a = 2;
        int b = 91;
        Solution s = new Solution();
        System.out.println(s.solution(a, b));
    }
}