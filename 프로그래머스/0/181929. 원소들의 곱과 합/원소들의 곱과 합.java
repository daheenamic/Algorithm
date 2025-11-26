class Solution {
    public int solution(int[] num_list) {
        int sum = 0;
        int cad = 1;
        for (int num : num_list) {
            sum += num;
            cad *= num;
        }
        
        return cad < (sum*sum) ? 1 : 0;
    }
}