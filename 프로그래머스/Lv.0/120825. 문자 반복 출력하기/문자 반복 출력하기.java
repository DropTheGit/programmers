class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for (int i = 0 ; i < my_string.length(); i++) {
            String s = "";
            for(int j = 0 ; j < n ; j++){
                s += my_string.charAt(i); 
            }
            answer += s;
        }
        return answer;
    }
}