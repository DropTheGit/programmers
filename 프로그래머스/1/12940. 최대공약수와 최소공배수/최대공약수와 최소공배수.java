import java.util.*;

class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];

        List<Integer> nList = new ArrayList<>();
        List<Integer> mList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
          if (n % i == 0) {
               nList.add(i);
            }
        }

        for (int j = 1; j <= m; j++) {
            if (m % j == 0) {
               mList.add(j);
          }
        }

        for (int i = 0; i < nList.size(); i++) {
           for (int j = 0; j < mList.size(); j++) {
              if (nList.get(i).equals(mList.get(j))) {
                 answer[0] = nList.get(i);
                 break;
               }
           }
        }
         
        List<Integer> nList2 = new ArrayList<>(); 
        List<Integer> mList2 = new ArrayList<>(); 
        
        for(int i = 0 ; i < m ; i++) {
            nList2.add(n * (i+1)); 
        }
        
        for(int i = 0 ; i < n ; i++) {
            mList2.add(m * (i+1)); 
        }
        
        for(int i = 0 ; i < m ; i++) {
            if(answer[1] != 0){
                break;
            }
           for(int j = 0 ; j < n ; j++){
               if(nList2.get(i).equals(mList2.get(j))){
                   answer[1] = mList2.get(j);
               }
           }  
        }
        
        return answer; 
    }
}