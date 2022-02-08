from math import gcd

def solution(w,h):
    return w*h-(w+h-gcd(w,h))

# 기울기를 구해보면 y=3/2x, x가 2의 배수 일 때 y가 3의 배수
# 최대공약수 = 직선이 지나는 사각형, 이때 사각형은 가로 2와 세로 3
# 최대공약수가 1일 때는 w+h-1개의 사각형을 지남
# 대각선이 지나는 사각형의 개수 = 최대공약수가 1일때 지나는 사각형 * 최대공약수
# 정리하면 (2+3-1)*4 = 8+12-4 = w+h-gcd(w,h)

w = 8 # 가로
h = 12 # 세로

print(solution(w,h)) # 80