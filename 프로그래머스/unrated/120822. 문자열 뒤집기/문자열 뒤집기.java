class Solution {
    public String solution(String my_string) {
        StringBuilder str = new StringBuilder(my_string);
        for (int i = 0 ; i < str.length() ; i++ ){
            str.setCharAt(i, my_string.charAt(my_string.length()-1-i));
        }
        String answer = str.toString(); 
        return answer;
    }
}