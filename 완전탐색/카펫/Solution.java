package 완전탐색.카펫;

public class Solution{
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int sum = brown + yellow;
        int n;

        for(int i=3; i<=sum;i++){
            if(sum%i==0){
                n=sum/i;
                if((i-2)*(n-2)==yellow && n>=i) return new int[]{n,i};
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int brown = 24;
        int yellow = 24;
        int[] ans = s.solution(brown, yellow);
        
        for(int arg : ans){
            System.out.println(arg);
        }
    }
}