def search(x,y) :
    if x<0 or x>=m or y<0 or y>=n or graph[x][y] == 0:
        return

    graph[x][y] = 0

    search(x+1,y)
    search(x-1,y)
    search(x,y+1)
    search(x,y-1)
    
import sys

sys.stdin = open(r"C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\Graph\1012\input.txt","r")
# 테스트 케이스 개수
t = int(input())

# 테스트 케이스만큼 실행
for _ in range(t) : 
    cnt = 0
    # 가로, 세로, 배추 개수
    m,n,k = map(int,input().split())
    graph = [[0]*n for _ in range(m)]
    
    for _ in range(k) :
        x,y = map(int,input().split())
        graph[x][y] = 1
    # 여기까지 문제 세팅

    # 문제 풀이 시작
    for i in range(m) :
        for j in range(n) :
            if graph[i][j] == 1:
                search(i,j)
                cnt +=1
    print(cnt)
    print(sys.getrecursionlimit())