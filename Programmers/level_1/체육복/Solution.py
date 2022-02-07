# 앞번호 학생이나 뒷번호 학생에게만 체육복을 빌려줄 수 있음
def solution(n, lost, reserve):

    r_set = set(reserve)-set(lost) # 여벌의 옷이 있는 학생 중 잃어버린 학생이 포함될 수 있으므로 전처리
    l_set = set(lost)-set(reserve) # 위와 같이 전처리

    for i in r_set : 
        if i-1 in l_set :
            l_set.remove(i-1)
        elif i+1 in l_set :
            l_set.remove(i+1)
    return n-len(l_set) # 체육수업을 들을 수 있는 학생 수

n = 5 # 전체 학생 수
lost = [2,4] # 도난당한 학생 번호
reserve = [1,3,5] # 여벌의 체육복을 가져온 학생들의 번호

print(solution(n,lost,reserve))