import heapq
# 섞은 음식의 스코빌 지수 = 
#   가장 맵지 않은 음식의 스코빌 지수 + 
#   (두 번째로 맵지 않은 음식의 스코빌 지수 * 2)

# 모든 음식의 스코빌 지수를 K이상으로 만들 수 없는 경우 -1 return
def solution(scoville, K):
    answer = 0
    heapq.heapify(scoville) # haep 생성
    
    if len(scoville) >= 2 : # 2개 이상의 음식
        while scoville[0] < K :
            print(scoville[0])
            if len(scoville) >= 2 : 
                _min = heapq.heappop(scoville)
                _2st = heapq.heappop(scoville)
                calc = _min + (_2st * 2)

                heapq.heappush(scoville,calc)
                answer += 1

            else :
                answer = -1
                break
            
    else : # 1가지의 음식
        if scoville[0] < K :
            answer = -1 # 1가지의 음식이 K를 넘지 못함

    return answer # 섞은 횟수

scoville = [1,2,3,9,10,12] # 음식의 스코빌 지수
# scoville = [1,1,1]
K = 7 # 원하는 스코빌 지수

print(solution(scoville,K))