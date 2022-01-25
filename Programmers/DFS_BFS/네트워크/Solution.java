package DFS_BFS.네트워크;

public class Solution {
    public int solution(int n, int[][] computers) {
        int answer = 0; 
        boolean[] visited = new boolean[n];

        for(int i=0; i<n; i++){
            if(!visited[i]){
                // dfs를 통해 다음 for문이 돌기 전에 네트워크가 연결된 노드를 방문 처리한다.
                dfs(computers, visited, i);
                // 위 dfs에서 재귀호출을 통해 연결된 네트워크가 처리되어 있으므로 네트워크 개수만 카운팅 된다.
                answer++;
            }
        }
        return answer;
    }

    void dfs(int[][] computers, boolean[] visited, int i){
        // 해당 노드가 방문하지 않은 노드라면 true를 넣어준다.
        if(!visited[i]) visited[i] = true;
        
        for(int j=0; j<computers.length; j++){
            // 자기 자신이 아님 && 해당 노드를 방문하지 않았음 && 네트워크가 연결되어 있음
            if(i!=j && visited[j]==false && computers[i][j]==1)
                // 재귀 호출을 통해 네트워크 연결을 확인하여 방문 처리함
                dfs(computers, visited, j);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 3; 
        int[][] computers = {{1,1,0}, {1,1,1}, {0,1,1}};

        System.out.println(s.solution(n, computers));
    }
}
