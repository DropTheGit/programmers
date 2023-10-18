class Solution {
    public int solution(int n) {
        int answer = 0;
        int j = 2;
        for(int i = 0 ; i < (double)(n-1)/2 ; i++){
            answer += j;
            j +=2;
        }
        return answer;
    }
}