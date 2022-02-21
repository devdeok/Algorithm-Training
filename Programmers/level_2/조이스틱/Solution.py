# 절대 level 2아님, 까먹지 않게 나중에 코드 다시 보기
def solution(name):
    if set(name) == {'A'}:
        return 0

    answer = float('inf')
    for i in range(len(name) // 2): # 반 이상 움직일 필요 없음
        left_moved = name[-i:]+name[:-i]
        right_moved = name[i:]+name[:i]
        for n in [left_moved, right_moved[0]+right_moved[:0:-1]]:
            while n and n[-1] == 'A':
                n = n[:-1]

            row_move = i + len(n)-1
            col_move = 0
            for c in map(ord, n):
                col_move += min(c - 65, 91 - c)

            answer = min(answer, row_move + col_move)

    return answer

# name = "JEROEN" # 56
# name = "JAZ" # 11
# name = "ABAAAAAAAAABB" # 7
# name = "BBBBAAAAAB" # 10
# name = "ABAAB" # 5
name = "BBBAAB" #9 <- 틀림

print("name : ",solution(name))

#                                 # O    x
# print(solution("ABABAAAAABA"))  #10 <- 4
# print(solution("CANAAAAANAN"))  #48 <- 42
# print(solution("ABAAAAABAB"))   #8  <- 6
# print(solution("ABABAAAAAB"))   #8  <- 6
# print(solution("BABAAAAB"))     #7  <- 4
# print(solution("ABAAAAAAABA"))  #6  <- 3
# print(solution("AABAAAAAAABBB"))#11 <- 7
# print(solution("BBBBAAAABA"))   #12 <- 8

