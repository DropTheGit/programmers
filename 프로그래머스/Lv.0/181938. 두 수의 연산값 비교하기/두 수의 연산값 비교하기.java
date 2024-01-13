class Solution {
    public int solution(int a, int b) {
        String str_a = String.valueOf(a); 
        String str_b = String.valueOf(b);
        int result = Integer.parseInt(str_a + str_b);
        int c = 2 * a * b; 
        
        if (result >= c) { return result;}
        else {return c; }
    }
}