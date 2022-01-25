package 완전탐색.모의고사;

import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int[] p1 = {1,2,3,4,5};
        int[] p2 = {2,1,2,3,2,4,2,5};
        int[] p3 = {3,3,1,1,2,2,4,4,5,5};
        int ans1=0, ans2 =0, ans3 =0;
        
        for(int i =0; i<answers.length; i++){
            if(p1[i%p1.length] == answers[i]) ans1++;
            if(p2[i%p2.length] == answers[i]) ans2++;
            if(p3[i%p3.length] == answers[i]) ans3++;
        }
        int max = Math.max(Math.max(ans1, ans2),ans3);
        ArrayList<Integer> list = new ArrayList<Integer>();
        if(max==ans1) list.add(1);
        if(max==ans2) list.add(2);
        if(max==ans3) list.add(3);
        
        answer = new int[list.size()];
        
        for(int i =0; i<answer.length; i++) {
        	answer[i] = list.get(i);
        }
        return answer;
    }
}