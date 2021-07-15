package 정렬.H_Index;

import java.util.Arrays;
import java.util.Collections;

class Solution {
    public int solution(int[] citations) {
        int[] arr = Arrays.stream(citations).
                    boxed().sorted(Collections.reverseOrder()).
                    mapToInt(Integer::intValue).toArray();
        int h=0;

        /**
         * 피인용수가 논문수보다 작아지기 시작하는 수가 h-index
         * i : 논문수
         * h : 피인용수
         */
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=i+1) h = Math.max(arr[i], i+1);
        }
        
        return h;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] citations = {3,0,6,1,5};

        System.out.println(s.solution(citations));
    }
}