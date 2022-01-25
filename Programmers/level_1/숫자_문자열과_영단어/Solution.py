def solution(s) :
    answer = ''
    temp = ''
    for i in s :
        if i.isdigit() :
            answer += i
        else :
            temp += i

            if temp == 'one' :
                answer += '1'
                temp = ''
            elif temp == 'two' :
                answer += '2'
                temp = ''
            elif temp == 'three' :
                answer += '3'
                temp = ''
            elif temp == 'four' :
                answer += '4'
                temp = ''
            elif temp == 'five' :
                answer += '5'
                temp = ''
            elif temp == 'six' :
                answer += '6'
                temp = ''
            elif temp == 'seven' :
                answer += '7'
                temp = ''
            elif temp == 'eight' :
                answer += '8'
                temp = ''
            elif temp == 'nine' :
                answer += '9'
                temp = ''
            elif temp == 'zero' :
                answer += '0'
                temp = ''
        
    return int(answer)

def solution_2(s) :
    answer = ''
    dic = {'zero':'0','one':'1','two':'2','three':'3','four':'4',
            'five':'5','six':'6','seven':'7','eight':'8','nine':'9'}
    temp = ''
    for i in s :
        if i.isdigit() :
            answer += i
        else :
            temp += i
            if temp in dic.keys() :
                answer += dic.get(temp)
                temp = ''

    return int(answer)


def main() :
    s = "one4seveneight"
    # s = "23four5six7"

    print(solution(s))
    print(solution_2(s))

if __name__ == '__main__' :
    main()
