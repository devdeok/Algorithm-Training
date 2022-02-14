def solution(lottos, win_nums):
    answer = []

    lottos_set = set(lottos)
    win_nums_set = set(win_nums)
    
    zero_count = lottos.count(0) # 0의 개수
    correct = len(win_nums_set&lottos_set) # 맞은 개수

    print(zero_count,correct)

    if correct < 2 : # 맞은 개수가 1,0일 경우
        answer.append(7-(correct+zero_count)) # 최고
        answer.append(6) # 최저
    else : # 맞은 개수가 2이상
        answer.append(7-(correct+zero_count)) # 최고
        answer.append(7-correct) # 최저

    return answer

lottos = [2,3,4,5,7,8]
# lottos = [44,1,0,0,31,25]
win_nums = [31,10,45,1,6,19]

print(solution(lottos,win_nums))