package level_1.음양_더하기;

// 내적
public class Solution{
    int[] absolutes = {4,7,12};
    boolean[] signs = {true,false,true};

    public int solution(int[] absolutes, boolean[] signs) {
        int answer = 0;
        for(int i=0;i<absolutes.length;i++){
            if(!signs[i]){
                absolutes[i] = -absolutes[i];
            }
            answer += absolutes[i];
        }
        return answer;
    }
}
