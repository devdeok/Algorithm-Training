package DFS_BFS.타겟넘버;
/**
 * dfs(배열, 타겟, 인덱스, 경우의 수) -> dfs(numbers, target, 0, 0)으로 호출
 * dfs에는 진행하는 동안 덧셈과 뺄셈을 각각 재귀호출
 * 기저 조건은 numbers의 크기와 index가 일치하는 경우 : 모든 자리에 대한 탐색 완료
 */
public class Solution {
    /**
     * 이 문제는 배열로 만들수 있는 target이 몇개 인지 맞추는 문제이다.
     * 그러므로 target에 맞는 값이 되었을 경우 횟수를 증가시켜주어야 한다.
     */ 
    public int solution(int[] numbers, int target) {
        return dfs(numbers, target, 0, 0);
    }

    private int dfs(int[] numbers, int target, int index, int num){
        // index가 재귀적으로 증가하다가 numbers.length와 같아지면 
        // 함수가 끝난 것이다.
        // 리턴되는 값은 num과 target이 같을 경우 1을 리턴하며
        // 그렇지 않을 경우 0을 리턴한다.
        if(index == numbers.length)
            return num == target ? 1 : 0;
        else
            return dfs(numbers, target, index+1, num+numbers[index]) + 
                   dfs(numbers, target, index+1, num-numbers[index]);
    }

    public static void main(String[] args) {
        int[] numbers = {1,1,1,1,1};
        int target = 3;

        Solution s = new Solution();
        System.out.println(s.solution(numbers, target));
    }
}
