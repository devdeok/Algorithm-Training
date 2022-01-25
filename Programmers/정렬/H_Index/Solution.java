package 정렬.H_Index;

import java.util.Arrays;

class Solution {
    public int solution(int[] citations) {
        // int[] arr = Arrays.stream(citations).
        //             boxed().sorted(Collections.reverseOrder()).
        //             mapToInt(Integer::intValue).toArray(); <-- 내림차순

        Arrays.sort(citations);

        // 피인용수가 논문수보다 작아지기 시작하는 수가 h-index

        int max = 0;
        for(int i=citations.length-1; i>-1; i--){
            int min = Math.min(citations[i],citations.length-i);
            if(max < min) max = min;
        }
        
        return max;
    }

    public static void main(String[] args) {
        int[] citations = {3,0,6,1,5};
        Solution s = new Solution();

        System.out.println(s.solution(citations));

    }
}
