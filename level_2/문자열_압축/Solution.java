package level_2.문자열_압축;

public class Solution {
    public int solution(String s) {
        // 길이 1짜리 문자열 처리
        if(s.length() == 1) return 1;

        int answer = s.length();
        String ansStr = "";
        StringBuilder sb = new StringBuilder();
        String compare = ""; // 임시로 저장할 반복 문자열

        // 절반이 넘어가면 의미가 없으므로 "길이/2"해줌
        for(int i=1; i<=s.length()/2; i++){
            String compression = s;
            int count = 1; // 반복 횟수 선언

            for(int j=0; j<s.length()/i; j++){
                // 압축된 문자열이 작아질 경우 반복문 나오기
                if(j>=compression.length()) break;

                // 비교할 문자열
                compare = compression.substring(j, j+i);
                System.out.println("문자열: " + s.substring(j+1)+
                " 문자열 번호 : " + (j+1));

                System.out.println("compare String : " + compare);
                if(s.substring(j+1,j+1+i).equals(compare)){
                    count++;
                    compression = compression.substring(0, j+1)+
                                  compression.substring(j+1+i, compression.length());
                    // compression에 중복된 값을 삭제한 값만 넣자?
                    System.out.println("compression : "+compression);
                }
                // 마지막 하나남은 문자열인 경우
                else if(s.substring(j+1).equals(compare)){
                }
                    
                if(count == 1) sb.append(compare);
                else sb.append(count).append(compare);
                count = 1; // 반복 횟수 초기화
            }
            ansStr = sb.toString(); // 문자열 옮기고
            sb.setLength(0); // sb 초기화

            // answer가 문자열의 최소 길이
            if(answer > ansStr.length()) answer = ansStr.length();
            System.out.println("최종 문자열 : "+ansStr);
            System.out.println("문자열 길이 : "+answer);
            System.out.println();
        }
        return answer;
    }
    
    public static void main(String[] args) {
        Solution s = new Solution();
        String str = "aabbaccc"; // "2a2ba3c" = 7

        
        System.out.println("정답 : "+s.solution(str));
    }
}