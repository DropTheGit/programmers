class Solution {
    public int solution(int n, int t) {
        int answer = n;
        int numOfGerm = n;
        for(int i = 1 ; i <= t ; i++) {
            answer *= 2; 
        }
        return answer;
    }
}