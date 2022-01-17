package level_2._124나라의숫자;

public class Solution {

    public static String solution(int n){
        StringBuilder sb = new StringBuilder();
        int temp;
        int remainder;

        temp = n;
        while(temp>0){
            remainder = temp%3;
            temp /= 3;
            
            // 3의 배수로 나누어 떨어질 경우 다음에 나눠주어야 하는 값의 나머지는 -1이므로 미리 1을 뺌
            if(remainder == 0) temp--;

            sb.insert(0, remainder==0?4:remainder);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int n = 21;

        System.out.println(solution(n));
        
        
    }
}
