import java.util.ArrayList;
import java.util.List;

public class test{
    public static void main(String[] args) {
        int servers = 2;
        int[] requests = {1,1,2,2};
        boolean sticky = true;
        int i = 0;
        int tempServer = 0;
    
        int[][] answer = 
            new int[servers][(int)Math.ceil((double)requests.length/(double)servers)];

            if(sticky){ // sticky : true
                for(int x=0; x<requests.length; x++){
                    answer[tempServer++][i] = requests[x];
                    
                    
                    if(tempServer == servers){
                      tempServer = 0;
                      i++;
                    }
                    if(x<requests.length-1 ){
                        if(requests[x]==requests[x+1]){
                            tempServer--;
                        }
                    }
                } 
            } // if
            else{
                for(int x=0; x<requests.length ; x++){
                    answer[tempServer++][i] = requests[x];
                    
                    if(tempServer == servers){
                      tempServer = 0;
                      i++;
                    } 
                } // for
            } // else

        
            for(int temp : answer[0]){
                System.out.println(temp);
            }



     }
}

// 문제 1 (테스트 케이스 5 실패)

// import java.lang.Math;

// class Solution {
//     public long solution(long orderAmount, long taxFreeAmount, long serviceFee) {
//         // orderAmount : 주문금액(공급가액)
//         // taxFreeAmount : 비과세금액
//         // serviceFee : 봉사료
        
//         // "부가가치세(VAT)"는 과세금액에서 10%산정, 소수점 첫째자리에서 올림 처리
//         // "과세금액"은 공급가액에서 비과세 금액을 빼주기(비과세 금액은 말 그대로 부가가치세가 부과되지 않는 금액)
        
//         /* 공급대가는 공급가액에 부가가치세를 더한 금액, 봉사료가 없다면 공급대가는 주문금액과 같음
//          * 하지만 봉사료가 들어갈 경우 주문금액에서 봉사료를 뺀 금액이 공급대가가 됨
//          */
//         // (공급대가 - 비과세금액) 1원은 예외 처리하여 0원으로 취급
        
//         long taxable = orderAmount - taxFreeAmount - serviceFee; // 과세금액 : 공급가액 - 비과세 금액
        
//         // 공급대가 : 공급가액 + 부가가치세
//         if(taxable < 10) taxable = 0;
        
        
//         long vat = (long)Math.ceil((double)taxable*0.1); // 부가가치세(과세금액의 10%),올림처리 완료
//         return vat;
//     }
// }

// 문제 2

// import java.util.ArrayList;
// import java.util.List;

// class Solution {
//     public int[][] solution(int servers, boolean sticky, int[] requests) {
//         int[][] answer = 
//             new int[servers][(int)Math.ceil((double)requests.length/(double)servers)];
        
//         int i = 0;
//         int tempServer = 0;
//         // true : request에서 같은 숫자를 하나로 봄
//         // false : 걍 번갈아가면서 넣기
        
//         if(sticky){ // sticky : true
//             for(int x=0; x<requests.length; x++){
                
//             } 
//         } // if
//         else{
//             for(int x=0; x<requests.length ; x++){
//                 answer[tempServer++][i] = requests[x];
                
//                 if(tempServer == servers){
//                   tempServer = 0;
//                   i++;
//                 } 
//             } // for
//         } // else
        
//         return answer;
//     }
// }


// 문제 3 (1,2,3,10,19,29 런타임 에러)

// class Solution {
//     public boolean solution(String amountText) {
//         // 올바른 영수증 : 세자리 구분자(,) / 25,000,123
        
//         // 0원을 제외한 경우 가장 왼쪽 숫자가 0일 수 없음 (0100같은거)
//         // 가짜 영수증 : 1만원 / 10,000원 / +300 / 24,999,99
        
//         StringBuffer sb = new StringBuffer(amountText);
//         String reversedStr = sb.reverse().toString();
//         char[] charArr = reversedStr.toCharArray();
        
//         // 구분자가 없는 숫자 판별
//         if(charArr[3] != ','){
//             for(int i=0 ; i<reversedStr.length();i++){
//                 if(!(charArr[i]-'0'<=9 && charArr[i]-'0' >= 0)) return false;
//             }
//         }
//         else{ // 구분자가 들어있는 숫자 판별
//             for(int i=0;i<reversedStr.length();i++){
//                 if(((i-3)%4)==0){ // ,
//                     if(charArr[i] != ',') return false;
//                 }

//                 else{ // 나머지 숫자들
//                     if(!(charArr[i]-'0'<=9 && charArr[i]-'0' >= 0)) return false;
//                 }
//             }
//         }
//         return true;
//     }
// }