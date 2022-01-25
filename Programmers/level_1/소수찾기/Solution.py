# 에라토스테네스의 체 사용
def solution(n) :
    check = [True]*(n+1)

    for i in range(2,int(n**0.5)+1):
        if check[i] == True :
            for j in range(i+i, n+1, i) :
                check[j] = False
    
    return [i for i in range(2,n+1) if check[i] == True]

def main() :
    n=5 # 2
    print(solution(n)) # 4

if __name__=='__main__' :
    main()