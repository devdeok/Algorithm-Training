import operator
# 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수/스테이지에 도달한 플레이어 수
# N : 스테이지 개수, stages : 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
def solution(N, stages) :
    dic={} # 실패확률
    total_num = len(stages) #총인원

    for i in range(1,N+1) : 
        if total_num != 0 :
            dic[i] = stages.count(i)/total_num # 남아있는 인원수/총 인원수
            total_num -= stages.count(i) # 총 인원수 - 앞에 남아있는 인원수
        else :
            dic[i] = 0
    
    # 0이면 key기준, 1이면 value기준
    return list(dict(sorted(dic.items(), key=operator.itemgetter(1), reverse=True))) # 실패율이 높은 스테이지부터 내림차순으로 정렬

# N = 5
# stages = [2,1,2,6,2,4,3,3]

N = 4
stages = [4,4,4,4,4]

print(solution(N,stages))