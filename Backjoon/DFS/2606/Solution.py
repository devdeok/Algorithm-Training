import sys

sys.stdin = open(r"C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\DFS\2606\input_2606.txt","r")


n = int(input()) # 컴퓨터의 수
fair_num = int(input()) # 네트워크상 직접 연결되어 있는 컴퓨터 쌍의 수

computer = [[]*n for _ in range(n+1)]

for _ in range(fair_num) :
    a,b = map(int,input().split())
    computer[a].append(b)
    computer[b].append(a)

cnt = 0
visited = [0]*(n+1)

def dfs(start) : 
    global cnt
    visited[start] = 1
    print("{} = ".format(start),visited)
    for i in computer[start]:
        if visited[i]==0: # 방문하지 않은 노드일 경우 dfs반복
            dfs(i)
            cnt += 1

dfs(1)
print(cnt)