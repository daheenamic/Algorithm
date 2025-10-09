import java.util.HashSet;
import java.util.Set;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        int a = nums.length / 2;

        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }

        if((a-set.size()) >= 0) answer = set.size();
        else answer = a;

        return answer;
    }

    public static void main(String[] args) {
        int[] nums = {3, 3, 3, 2, 2, 4};

        Solution s = new Solution();
        System.out.println(s.solution(nums));
    }
}