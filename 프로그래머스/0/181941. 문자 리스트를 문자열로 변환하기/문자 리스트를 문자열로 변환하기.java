class Solution {
    public String solution(String[] arr) {
        return String.join("", arr);
    }

    public static void main(String[] args) {
        String[] arr = {"a", "b", "c"};
        Solution s = new Solution();
        System.out.println(s.solution(arr));
    }
}