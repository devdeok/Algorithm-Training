from collections import deque
import math
import sys

sys.stdin = open(r"C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\Graph\1697\input.txt","r")

# 수빈 위치, 동생 위치
n,k = map(int, input().split())
cnt = 0
MAX = 100000

queue = deque([n])
visited = [0]*(MAX+1)

while queue :
    p = queue.popleft()
    
    if p == k :
        print(visited[p])
        break

    for i in (p-1,p+1,2*p) :
        if 0<= i <= MAX and visited[i] == 0 : 
            visited[i] = visited[p]+1
            queue.append(i)
            