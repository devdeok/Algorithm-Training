from collections import deque
import sys

sys.stdin = open(r'C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\Graph\2178\input.txt','r')

n,m = map(int,input().split())
maze = []
visited = []

for _ in range(n) :
    maze.append(list(map(int,input().rstrip())))
    visited.append([0]*m)

x,y = 0,0
dx = [-1,1,0,0]
dy = [0,0,-1,1]
visited[0][0] = 1

queue = deque()
queue.append((x,y))

while queue :
    x,y = queue.popleft()

    if x == n and y == m :
        break

    for i in range(4) :
        nx = x + dx[i]
        ny = y + dy[i]

        if 0 <= nx < n and 0 <= ny < m :
            if visited[nx][ny] == 0 and maze[nx][ny] == 1 :
                visited[nx][ny] = visited[x][y] + 1
                queue.append((nx,ny))
    
print(visited[n-1][m-1])