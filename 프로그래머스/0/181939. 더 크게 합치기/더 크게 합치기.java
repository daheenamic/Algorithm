class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(a + "" + b);
        int ba = Integer.parseInt(b + "" + a);
        return Math.max(ab, ba);
    }
    
    public static void main(String[] args) {
        int a = 9;
        int b = 91;
        Solution s = new Solution();
        System.out.println(s.solution(a, b));
    }
}