def solution(answers):
    answer = {i:0 for i in range(1,4)}
    result = []
    
    supoza1 = [1,2,3,4,5]
    supoza2 = [2,1,2,3,2,4,2,5]
    supoza3 = [3,3,1,1,2,2,4,4,5,5]

    for i in range(len(answers)) :
        if answers[i] == supoza1[i%len(supoza1)] : 
            answer[1]+=1
        if answers[i] == supoza2[i%len(supoza2)] : 
            answer[2]+=1
        if answers[i] == supoza3[i%len(supoza3)] : 
            answer[3]+=1
    
    for person,score in answer.items() :
        if score == max(answer.values()) :
            result.append(person)

    return result # 가장 높은 점수를 받은 사람이 여럿일 경우, 오름차순 정렬

# answers = [1,2,3,4,5]
answers = [1,3,2,4,2]

print(solution(answers))