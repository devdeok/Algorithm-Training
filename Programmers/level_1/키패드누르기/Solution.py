# 엄지손가락 : 상하좌우 4가지 방향, 키패드 이동 한칸은 거리로 1
# 왼쪽 열의 3개 숫자 1 4 7 입력시 왼손 엄지손가락
# 오른쪽 열의 3개 숫자 3 6 9 입력시 오른손 엄지손가락
# 가운데 열 4개의 숫자 2 5 8 0 입력시 가까운 엄지손가락(거리가 같을 경우 오른손 잡이는 오른손 먼저)
def solution(numbers, hand):
    answer = ''
    key_pos = {1:(3,0),2:(3,1),3:(3,2),
               4:(2,0),5:(2,1),6:(2,2),
               7:(1,0),8:(1,1),9:(1,2),
             '*':(0,0),0:(0,1),'#':(0,2)}

    latest_L = '*'
    latest_R = '#'

    for num in numbers :
        if num in [1,4,7] : # 왼쪽 숫자 : 1 4 6
            answer+="L"
            latest_L = num

        elif num in [3,6,9] : # 오른쪽 숫자 : 3 6 9
            answer+="R"
            latest_R = num

        elif num in [2,5,8,0] : # 가운데 숫자 : 0 2 5 8
            cur_pos = key_pos[num] # 현재 눌러야 하는 수
            left_pos = key_pos[latest_L] # 왼손 좌표
            right_pos = key_pos[latest_R] # 오른손 좌표

            length_L = abs(cur_pos[0]-left_pos[0])+abs(cur_pos[1]-left_pos[1])
            length_R = abs(cur_pos[0]-right_pos[0])+abs(cur_pos[1]-right_pos[1])

            if length_L < length_R : # 왼손의 거리가 가까울 때
                latest_L = num
                answer += "L"

            elif length_L > length_R :# 오른손의 거리가 가까울 때
                latest_R = num
                answer += "R"

            else : # 길이가 같을 경우
                if hand == "right" : # 오른손 잡이
                    print('right : ',num)
                    latest_R = num
                    answer += "R"

                else : # 왼손 잡이
                    print('left : ',num)
                    latest_L = num
                    answer += "L"

    return answer

# numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 0] # r LLRLLRLLRL
numbers = [7, 0, 8, 2, 8, 3, 1, 5, 7, 6, 2] # l LRLLRRLLLRR
# numbers = [1,3,4,5,8,2,1,4,5,9,5] # r LRLLLRLLRRL
# hand = "right"
hand = "left"

print(solution(numbers,hand)) 