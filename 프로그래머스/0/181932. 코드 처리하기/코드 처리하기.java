class Solution {
    public String solution(String code) {
        StringBuilder sb = new StringBuilder();
        int mode = 0;

        for (int i = 0; i < code.length(); i++) {
            char c = code.charAt(i);
            if (c == '1') {
                mode ^= 1;
            } else if (i % 2 == mode) {
                sb.append(c);
            }
        }

        return sb.length() == 0 ? "EMPTY" : sb.toString();
    }
}