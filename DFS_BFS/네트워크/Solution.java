package DFS_BFS.네트워크;

/**
 * 1. 연결된 경우를 확인하기 위한 boolean visited 생성
 * 2. dfs 실행 전 네트워크의 수 증가
 * 3. 모든 노드에 대해 dfs 실행 (단, 방문했던 경우는 제외. 연결된 곳 포함)
 * 4. 노드 방문 표시
 * 5. 해당 노드에서 다른 노드로 연결된게 있는지 전체 탐색. 있는 경우 dfs 호출
 */
public class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0; 
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                dfs(computers, visited, i);
                answer++;
            }
        }

        return answer;
    }

    void dfs(int[][] computers, boolean[] visited, int i){
        // 해당 노드가 방문하지 않은 노드라면 true를 넣어준다.
        if(!visited[i]) visited[i] = true;
        
        for(int j=0; j<computers.length; j++){
            if(i!=j && visited[j]==false && computers[i][j]==1){
                dfs(computers, visited, j);
            }
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 3; 
        int[][] computers = {{1,1,0}, {1,1,0}, {0,0,1}};

        System.out.println(s.solution(n, computers));
    }
}
