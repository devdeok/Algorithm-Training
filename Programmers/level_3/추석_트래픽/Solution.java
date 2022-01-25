package level_3.추석_트래픽;

public class Solution {
    public int solution(String[] lines) {
        int answer = 0;
        int[][] responseTime = new int[lines.length][3]; // 응답시간 hh / mm / ss로 나눌 배열
        String[][] process = new String[lines.length][2]; // 응답시작시간, 응답완료시간 담을 배열

        // 응답완료시간 S 2016-09-15 hh:mm:ss.sss
        // 처리시간 T 0.1s 0.312s 2s (소수점 셋째 자리까지 기록)

        calTime(lines, responseTime); // 여기서 시간 계산, 밀리세크 단위로 계산하기

        
        // 구간별 초당 최대 처리량 반환
        return answer;
    }

    void calTime(String[] lines, int[][] responseTime){
        String[] split; // 처음 문자열 자를 곳
                        // 시간을 hh / mm / ss로 나눔
        for(int i=0; i<lines.length; i++){
            split = lines[i].split(" "); // 처음 문자열을 날짜 / 시간 / 처리시간 으로 나눔
            
            
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();

        // return : 1
        String[] lines = {"2016-09-15 01:00:04.001 2.0s",
                          "2016-09-15 01:00:07.000 2s"};

        System.out.println(s.solution(lines));
    }
}
