def solution(numbers):
    answer = ''

    str_numbers = [str(i) for i in numbers]

    for i in str_numbers :
        print("len ",len(i))
        print("앞자리 ",i[0])

    
    return answer

numbers = [6,10,2] # 6210

print(solution(numbers)) 