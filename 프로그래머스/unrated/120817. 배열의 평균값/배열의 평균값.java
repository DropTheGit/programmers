class Solution {
    public double solution(int[] numbers) {
        int sum = 0;
        for(int number : numbers){
            sum += number;
        }
        
        double average = (double)sum / numbers.length; 
        return average;
    }
}