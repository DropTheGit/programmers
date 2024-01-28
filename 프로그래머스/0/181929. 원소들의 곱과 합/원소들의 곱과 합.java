class Solution {
    public int solution(int[] num_list) {
        int multiple = 1; 
        int sum = 0;
        
        for(int i = 0 ; i < num_list.length ; i ++) {
            multiple *= num_list[i]; 
        }
        
        for(int i = 0 ; i < num_list.length ; i ++) {
            sum += num_list[i]; 
        }
        
        return multiple < sum*sum ? 1 : 0;  
    }
}