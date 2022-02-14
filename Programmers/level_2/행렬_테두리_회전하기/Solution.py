# 슬라이딩 퍼즐과 같이 배열의 한 숫자를 빼고 한칸씩 밀기
def solution(rows, columns, queries):
    answer = []
    
    # 배열 만들기
    arr = [] # rows X columns 배열
    num = 0 # 배열에 들어갈 수
    for i in range(1,rows+1) :
        temp_arr = []
        for j in range(1,columns+1) :
            num += 1
            temp_arr.append(num)
        arr.append(temp_arr)

    # 테두리
    
    for x1,y1,x2,y2 in queries :
        temp = arr[x1-1][y2-1] # 한칸 빼기
        _min = 10001 # 최소값 비교를 위해 제일 큰 수로 선언 

        # 북
        _min = min(min(arr[x1-1][y1-1:y2-1]),_min)
        arr[x1-1][y1:y2] = arr[x1-1][y1-1:y2-1]

        # 서
        for x in range(x1,x2) :
            _min = min(arr[x][y1-1],_min)
            arr[x-1][y1-1] = arr[x][y1-1]

        # 남
        _min = min(min(arr[x2-1][y1:y2]),_min)
        arr[x2-1][y1-1:y2-1] = arr[x2-1][y1:y2]

        # 동
        for x in range(x2-2,x1-1,-1) :
            _min = min(arr[x][y2-1],_min)
            arr[x+1][y2-1] = arr[x][y2-1]

        arr[x1][y2-1] = temp 
        _min = min(_min,temp)

        answer.append(_min)

    return answer

rows = 6
columns = 6
queries = [[2,2,5,4],[3,3,6,6],[5,1,6,3]] # x1,y1,x2,y2 

print(solution(rows,columns,queries)) # [8,10,25]