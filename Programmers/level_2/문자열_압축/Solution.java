package level_2.문자열_압축;

public class Solution {
    public int solution(String s) {
        // 길이 1짜리 문자열 처리
        if(s.length() == 1) return 1;

        int answer = s.length();
        StringBuilder sb = new StringBuilder();
         

        // 절반이 넘어가면 의미가 없으므로 "길이/2"해줌
        for(int i=1; i<=s.length()/2; i++){
            String temp = ""; // 기준 문자열
            String compare = ""; // 비교 문자열
            sb.setLength(0);
            int count = 1; // 반복된 횟수

            for(int j=0; j<=s.length()/i; j++){
                int start = i*j;
                int end = i * (j+1);

                if(end > s.length()) end = s.length();
                
                temp = compare;
                compare = s.substring(start, end);
                if(temp.equals(compare)) count++;
                else{
                    if(count>1) sb.append(count);
                    sb.append(temp);
                    count = 1;
                }
            }
            if(count > 1) sb.append(count);
            sb.append(compare);
            answer = Math.min(sb.toString().length(), answer);
            
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "xababcdcdababcdcd"; // "2a2ba3c" = 7
        // String str = "ababcdcdababcdcd"; // 9

        
        System.out.println("정답 : "+s.solution(str));
    }
}