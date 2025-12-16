import java.util.*;

class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        
        Set<Integer> set = new HashSet<>(Arrays.asList(a, b, c));
        
        int cal1 = a + b + c;
        int cal2 = (a*a)+(b*b)+(c*c);
        int cal3 = (a*a*a)+(b*b*b)+(c*c*c);
        
        if(set.size() == 3) answer = cal1;
        else if (set.size() == 2) answer = cal1 * cal2;
        else answer = cal1 * cal2 * cal3;
        
        return answer;
    }
}