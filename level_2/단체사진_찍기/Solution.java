package level_2.단체사진_찍기;

public class Solution {
    // A, C, F, J, M, N, R, T
    // 순열
    public int solution(int n, String[] data) {
        int answer = 0;
        char[] friends = {'A','C','F','J','M','N','R','T'};
        



        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 2;
        // N과 F가 간격이 0, R과 T가 간격이 2보다 큼
        String[] data = {"N~F=0","R~T>2"};

        // 경우의 수 : 3648
        System.out.println(s.solution(n, data));
    }
}