

class Solution {
    public String solution(String my_string, int k) {
        return my_string.repeat(k);
    }

    public static void main(String[] args) {
        String my_string = "string";
        int k = 10;

        Solution s = new Solution();
        System.out.println(s.solution(my_string, k));
    }
}