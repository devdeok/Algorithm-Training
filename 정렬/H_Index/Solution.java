package 정렬.H_Index;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        int answer = 0;
        int h=0, k=0;
        Arrays.sort(citations);

        // h보다 높은 인용수를 가진 논문의 개수를 세줌
        for(int arg : citations){
            h = arg;
            
        }


        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] citations = {3,0,6,1,5};

        System.out.println(s.solution(citations));
    }
}