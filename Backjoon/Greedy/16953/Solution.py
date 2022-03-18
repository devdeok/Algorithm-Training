from collections import deque
import sys

sys.stdin = open(r'C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\Greedy\16953\input.txt','r')

a,b = map(int,input().split())
cnt = 1

while(b!=a) :
    cnt+=1
    tmp = b

    if b%10 == 1 :
        b = b//10
    elif b%2 == 0 :
        b = b/2
    
    if tmp == b :
        print(-1)
        break
else :
    print(cnt)