from collections import deque

def solution(numbers, target):
    answer = 0
    queue = deque()
    n = len(numbers)

    queue.append([numbers[0],0]) # 초기 덧셈값
    queue.append([-1*numbers[0],0]) # 초기 뺄셈값

    # bfs를 통해 
    while queue  :
        temp, idx = queue.popleft() # 제일 왼쪽의 값과 인덱스
        idx+=1 # 인덱스를 하나 증가

        if idx < n : # numbers의 길이보다 작을 경우
            queue.append([temp+numbers[idx],idx]) # 덧셈 값과 인덱스 추가
            queue.append([temp-numbers[idx],idx]) # 뺄셈 값과 인덱스 추가
        else :
            if temp == target : # target과 같을 경우
                answer+=1

    return answer

numbers = [1,1,1,1,1]
target = 3 # 5

# numbers = [4,1,2,1]
# target = 4

print(solution(numbers,target)) 