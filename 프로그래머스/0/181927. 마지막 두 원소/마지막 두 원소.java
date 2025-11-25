import java.util.Arrays;

class Solution {
    public int[] solution(int[] num_list) {
        int n = num_list[(num_list.length-1)];
        int m = num_list[(num_list.length-2)];
        
        int[] newArr = Arrays.copyOf(num_list, num_list.length + 1);
        newArr[num_list.length] = n > m ? n - m : n * 2;
        
        return newArr;
    }
}