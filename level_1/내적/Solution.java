package level_1;

// 내적
public class Solution{
    int[] a = {1,2,3,4};
    int[] b = {-3,-1,0,2};

    public int solution(int[] a, int[] b) {
        int answer = 0;
        for(int i=0;i<a.length;i++){
            answer = answer + (a[i]*b[i]);
        }
        return answer;
    }
}



