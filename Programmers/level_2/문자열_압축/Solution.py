def solution(s):
    result = len(s) # 문자열의 길이가 최대값

    # 길이 1짜리 문자열 처리    
    if len(s) == 1 :
        return 1

    # i단위로 문자열을 나눔, 절반 이상을 넘어가면 의미가 없음
    for i in range(1, len(s)//2+1) :
        comp = s[:i] # 비교 문자열
        count = 1 # 반복된 횟수
        temp_str = "" # 저장 문자열

        # 비교 시작
        for j in range(i, len(s), i) : 
            if comp==s[j:i+j] : # 문자열이 같을 경우 횟수 증가
                count += 1
            else : # 문자열이 다를 경우
                if count != 1 : # 횟수가 2이상이면 
                    temp_str += str(count) + comp # 횟수 + 비교문자열을 더해줌
                else : # 횟수가 1일 경우
                    temp_str += comp # 비교문자열만 더함

                comp = s[j:i+j] # 비교문자열을 바꿔줌
                count = 1 # 횟수를 1로 초기화
            print("j 부분 문자열 : ",temp_str)

        if count != 1 :
            temp_str += str(count) + comp
        else : 
            temp_str += comp
            
        print("i 문자열 : ",temp_str," 단위 : ",i)
        result = min(result, len(temp_str)) # 현재 문자열 길이와 비교한 문자열 길이 중 최소값

    return result

s = "aabbaccc" # 7
# s = "abcabcabcabcdededededede" # 14

print(solution(s))