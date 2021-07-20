package Stack_Queue.기능개발;

import java.util.ArrayList;
import java.util.Stack;

public class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> answer = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        int index = 0; // 저장할 주소
        int cnt = 0;   // 횟수
    
        for(int i=progresses.length-1;i>-1;i--)
            stack.push(100-progresses[i]);

        // 비교할 변수
        int temp = (int)Math.ceil((double)stack.peek()/(double)speeds[0]);
        for(int i=0;i<progresses.length;i++){    
            if(temp >= (int)Math.ceil((double)stack.peek()/(double)speeds[i])){
                cnt++;
                stack.pop();
            }
            else{
                answer.add(index, cnt);
                index++;
                cnt = 1;
                temp = (int)Math.ceil((double)stack.pop()/(double)speeds[i]);
            }
        }

        answer.add(index, cnt); // for문이 끝나면 stack이 비어있음
    
        return answer.stream().mapToInt(i->i).toArray();
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] progresses = {20,99,93,30,55,10};
        int[] speeds = {5,10,1,1,30,5};

        // {3, 3}
        System.out.println(s.solution(progresses, speeds));
    }
}
