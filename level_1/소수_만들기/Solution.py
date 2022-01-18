# 서로 다른 3개를 골라 더했을 때 소수가 되는 경우의 개수
def solution(nums):
    answer = 0
    
    for i in range(0, len(nums)-2) :
        for j in range(i+1, len(nums)-1) :
            for k in range(j+1, len(nums)) :
                sum = nums[i] + nums[j] + nums[k]
                check = True

                for a in range(2, sum) : # 소수 판별
                    if sum % a == 0 :
                        check = False # 소수가 아니므로 False
                        break
                
                if check : # 소수이므로 1 증가
                    answer += 1

    return answer

from itertools import combinations

def solution_2(nums) : 
    answer = 0
    cmbs = list(combinations(nums, 3)) # nums배열을 3개씩 조합 후 list로 변경

    for cmb in cmbs : 
        sum = cmb[0] + cmb[1] + cmb[2]
        check = True

        for i in range(2, sum) :
            if sum%i == 0 :
                check = False
                break
        
        if check :
            answer += 1
    
    return answer

def main() :
    # nums = [1,2,3,4]
    nums = [1,2,7,6,4]
    print(solution(nums))
    print(solution_2(nums))

if __name__ == '__main__' :
    main()