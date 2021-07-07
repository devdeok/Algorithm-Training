package Hash.위장;

import java.util.HashMap;

class Solution{
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer>map = new HashMap<>();

        for(int i=0 ; i<clothes.length ; i++){
            if(map.containsKey(clothes[i][1])) // 있을 경우
                map.put(clothes[i][1],map.get(clothes[i][1])+1);
            else // 없을 경우
                map.put(clothes[i][1],1);
        }
        for(int value : map.values()){
            answer *= value + 1;
        }
        answer -= 1;
        
        return answer;
    }
}