from collections import deque

def dfs(v) : 
    print(v, end = ' ')
    visited[v] = True
    for i in graph[v] :
        if not visited[i] : # 방문하지 않은 노드이면
            dfs(i)

def bfs(v):
    queue = []
    queue = deque([v])
    visited[v] = True

    while queue :
        v = queue.popleft()
        print(v, end = ' ')
        for i in graph[v] :
            if not visited[i] : # 방문하지 않은 노드면
                queue.append(i) # queue에 추가
                visited[i] = True # 방문 표시
    
import sys

sys.stdin = open(r"C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\DFS\1260\input.txt","r")

# 노드, 간선, 탐색 시작 노드
n,m,v = map(int, input().split())
graph = [[] for _ in range(n+1)]
visited = [False] * (n+1)

for i in range(m) :
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

for i in range(n+1) : 
    graph[i].sort()

dfs(v)
print()
visited = [False] * (n+1)
bfs(v)