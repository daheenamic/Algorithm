import java.util.HashMap;
import java.util.Map;

class Solution {
    public int solution(String[][] clothes) {
        
        Map<String, Integer> map = new HashMap<>();
        for (String[] item : clothes) {
            String type = item[1];
            map.put(type, map.getOrDefault(type, 0) + 1);
        }

        int answer = 1;
        for(int cnt : map.values()) {
            answer *= (cnt + 1); 
        }

        return answer - 1;
    }

    public static void main(String[] args) {
        String[][] clothes = {
                {"yellow_hat", "headgear"},
                {"blue_sunglasses", "eyewear"},
                {"green_turban", "headgear"}
        };

        Solution s = new Solution();
        System.out.println(s.solution(clothes));
    }
}