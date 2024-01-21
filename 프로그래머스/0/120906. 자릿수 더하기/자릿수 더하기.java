class Solution {
    public int solution(int n) {
        int answer = 0; 
        String str = String.valueOf(n);
        char[] chars = str.toCharArray(); 
        for(int i = 0; i < str.length() ; i++ ){
            int number = Integer.parseInt(String.valueOf(chars[i]));
            answer += number; 
        }
        return answer;
    }
}