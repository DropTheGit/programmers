
class Solution {
    public int[] solution(int n) {
        int length = 0; 
        
        if (n%2 == 0){
            length = n/2; 
        } else {
            length = (n/2) + 1;
        }
        
        int[] answer = new int[length]; 
        
        for(int i = 0 ; i < length; i++){
            answer[i] = (2*i)+1; 
        }
        
        return answer;
    }
}