def solution(n):
    answer = 0
    ternary = []
    
    while n>3 :
        ternary.append(n%3)
        n = int(n/3)

    ternary.append(n)
    ternary.reverse()
    num = 0
    for i in ternary :
        answer += i*pow(3,num)
        num+=1
        
    return answer

n = 45 # 7
print(solution(n)) 