# N마리의 폰켓몬 중 N/2까지 선택가능

def solution(nums):
    answer = 0
    nums_set = set(nums)

    if len(nums_set) >= len(nums)//2 :
        answer = len(nums)//2
    else :
        answer = len(nums_set)

    return answer # 최대 고를 수 잇는 폰켓몬 종류의 수

# nums = [3,1,2,3] # 2
# nums = [3,3,3,2,2,4] # 3
nums = [3,3,3,2,2,2] # 2

print(solution(nums))