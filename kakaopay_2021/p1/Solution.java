package kakaopay_2021.p1;

public class Solution {
    public int solution (int money, int minratio, int maxratio, int ranksize, int threshold, int months){
        int assumeMoney, num, tax=0;

        // 이게 달마다 적용되게끔 하자
        for(int i=0; i<months; i++){
            assumeMoney = money - (money%100); // 소유 가정 금액
            num = 0; // 부과할 세금 범위를 찾아야 하므로 다시 0으로 초기화
            if(maxratio != 0){
                if(assumeMoney < threshold) // threshold 미만
                    tax=0;
                else{ // threshold이상
                    while(!(assumeMoney>=threshold+(num*ranksize) && 
                            assumeMoney<threshold+((num+1)*ranksize))){ //다음 조건이 만족하지 않는다면 num을 하나씩 늘려감 그러다가 조건만족시 tax를 갱신
                        num++;
                    }
                    
                    if(minratio+num >= maxratio) // minratio가 maxratio보다 크거나 같을 경우 maxratio로 세금 부과
                        tax = (int)(assumeMoney *((double)maxratio/(double)100));
                    else // minratio로 세금 부과
                        tax = (int)(assumeMoney * ((double)(minratio+num)/(double)100));
                }
                money = money - tax; // 달마다 세금 차감
            }

        }
        return money;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int money = 123456789;
        int minratio = 0;
        int maxratio = 0;
        int ranksize = 1;
        int threshold = 0;
        int months = 360;

        System.out.println(s.solution(money, minratio, maxratio, ranksize, threshold, months));
    }
}
