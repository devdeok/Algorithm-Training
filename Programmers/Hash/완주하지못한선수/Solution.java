package Hash.완주하지못한선수;

import java.util.*;

class Solution {    
    String[] participant={"leo","kiki","eden"};
    String[] completion={"eden","kiki"};

    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        Map<String,Integer>hash = new HashMap<>();

        for(String arg:participant)
            hash.put(arg,hash.getOrDefault(arg,0)+1);

        for(String arg:completion)
            hash.put(arg,hash.getOrDefault(arg,0)-1);
        
        for(String key:hash.keySet()){
            if(hash.get(key)!=0)
                answer=key;
        }
        
        return answer;
    }
}