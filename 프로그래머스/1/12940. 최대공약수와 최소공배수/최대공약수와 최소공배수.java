class Solution {
    
    public static int findGCD(int num1, int num2) {
        if (num2 == 0) {
            return num1;
        }
        return findGCD(num2, num1 % num2);
    }
    
    public static int findLCM(int num1, int num2) {
     int gcd = findGCD(num1, num2);
     int lcm = (num1 * num2) / gcd;
        return lcm;
    }
    
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = findGCD(n, m);
        answer[1] = findLCM(n, m);
        return answer;
    }
}