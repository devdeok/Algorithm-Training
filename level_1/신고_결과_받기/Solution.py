# k번 이상 신고된 유저는 게시판 이용 정지
# k번 이상 신고된 유저를 신고한 유저에게 알림 메일 발송
# 동일 유저에 대한 신고는 1회

def solution(id_list, report, k):
    # set를 사용하면 중복 허용 x
    count = {id : set() for id in id_list} # 결과 처리 메일 받은 횟수
    
    for r in report :
        reporter, reportee = r.split()
        count[reportee].add(reporter)
        print(count[reportee])

    answer = {id : 0 for id in id_list}
    
    for key, values in count.items() :
        if len(values) >= k :
            for value in values :
                answer[value] += 1

    print('========result========')
    return list(answer.values())


def main():
    id_list = ["muzi", "frodo", "apeach", "neo"]
    report = ["muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"]
    k = 2

    
    print(solution(id_list, report, k)) # 2,1,1,0

if __name__ == '__main__' : 
    main()