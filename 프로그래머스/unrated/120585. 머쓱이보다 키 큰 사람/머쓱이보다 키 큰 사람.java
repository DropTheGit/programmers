import java.util.*;

class Solution {
    public int solution(int[] array, int height) {
        int answer = 0;
       List<Integer> heights = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            heights.add(array[i]);
        }
        for(int i = 0; i < heights.size(); i++){
            int a = heights.get(i);
            if(a>height){
                answer++;
            }
        }
        return answer;
    }
}