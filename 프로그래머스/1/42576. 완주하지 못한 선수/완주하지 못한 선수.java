import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        for (String p : participant) {
            // 있으면 현재 값, 없으면 0 -> 그 값에 +1
            // leo, kiki, eden이 들어올 경우 value가 1
            // 만약에 leo가 한번 더 들어오면 현재 값에 +1 이니까 leo만 2
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        for (String c : completion) {
            // 기존값을 가져와서 -1을 함.
            // 모두가 1인상태에서 완주한사람만 -1을 하면, 완주자는 0이 됨
            // 완주하지 못한 사람은 그대로 1
            map.put(c, map.get(c) - 1);
        }

        // value가 0이상인 사람은 완주를 못함
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            if (e.getValue() > 0) {
                return e.getKey();
            }
        }
        return null;
    }

    public static void main(String[] args) {
        String[] participant = {"mislav", "stanko", "mislav", "ana"};
        String[] completion = {"stanko", "ana", "mislav"};

        Solution s = new Solution();
        System.out.println(s.solution(participant, completion));
    }
}