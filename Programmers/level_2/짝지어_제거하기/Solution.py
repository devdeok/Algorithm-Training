# 효율성 1번 8번 실패
# def solution(s):
#     answer = -1
#     temp = ""

#     for c in s :
#         if temp.endswith(c) :
#             temp = temp.rstrip(c)
#         else :
#             temp+=c

#     if len(temp) == 0 :
#         answer = 1
#     else :
#         answer = 0

#     return answer

# 짝지어 제거 성공 시 1,제거 실패시 0
def solution(s):
    answer = -1
    temp = []

    for c in s :
        # if temp.endswith(c) :
        #     temp = temp.rstrip(c)
        if len(temp) > 0 and temp[-1] == c :
            temp.pop()
        else :
            temp.append(c)

    if len(temp) == 0 :
        answer = 1
    else :
        answer = 0

    return answer

s = "baabaa" # 1
# s = "cdcd" # 0

print(solution(s))