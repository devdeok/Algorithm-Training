import itertools
import sys

sys.stdin = open(r'C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\Backtracking\15649\input.txt','r')

n,m = map(int,input().split())
s = []

def dfs() :
    if len(s) == m:
        print(' '.join(map(str,s)))
        return 
    
    for i in range(1,n+1) :
        if i not in s :
            s.append(i)
            dfs()
            s.pop()

dfs()