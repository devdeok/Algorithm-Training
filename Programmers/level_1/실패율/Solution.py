import operator
# 스테이지에 도달했으나 아직 클리어하지 못한 플레이어의 수/스테이지에 도달한 플레이어 수
# N : 스테이지 개수, stages : 사용자가 현재 멈춰있는 스테이지의 번호가 담긴 배열
def solution(N, stages) :
    count = [0] * N
    dic =  {}

    for i in range(N) :
        num = 0
        for j in stages :
            if j>=i+1 :
                count[i]+=1
            if j==i+1 :
                num+=1
        dic[i+1] = num/count[i]
    
    # 0은 Key, 1은 Value
    sorted_dic = dict(sorted(dic.items(), key=operator.itemgetter(1), reverse=True))
    ans = list(sorted_dic)
    
    return ans # 실패율이 높은 스테이지부터 내림차순으로 정렬

def main() :
    N = 5
    stages = [2,1,2,6,2,4,3,3] # 3,4,2,1,5
    # stages = [4,4,4,4,4]

    print(solution(N,stages))

if __name__ == '__main__' :
    main()