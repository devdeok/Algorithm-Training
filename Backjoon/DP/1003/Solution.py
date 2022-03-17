test_case = []
zero = [1,0,1]
one = [0,1,1]

def fibonacci_cnt(n) :
    length = len(zero)

    if length <= n :
        for i in range(length, n+1) :
            zero.append(zero[i-1]+zero[i-2])
            one.append(one[i-1]+one[i-2])

    print("{} {}".format(zero[n],one[n]))

import sys

sys.stdin = open(r"C:\Users\DEOK\Desktop\Github\Programmers\Backjoon\DP\1003\input.txt","r")

# 테스트 케이스 개수
t = int(input())

for i in range(t) :
    test_case.append(int(input()))

for n in test_case :
    fibonacci_cnt(n)
