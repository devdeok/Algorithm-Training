import sys 
from collections import deque 

sys.stdin = open(r"C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\Graph\1697\input.txt","r")

def bfs(): 
    q = deque()
    q.append(n) 
    while q: 
        x = q.popleft() 
        if x == k: 
            print("정답 : ",dist[x]) 
            break 

        for j in (x-1,x+1,x*2): 
            if 0<= j <= MAX and not dist[j]: 
                dist[j] = dist[x] +1 
                q.append(j) 

MAX = 100000 
n,k = map(int,input().split()) 
dist = [0] * (MAX+1) 

bfs()