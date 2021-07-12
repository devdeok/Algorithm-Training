package 정렬.가장_큰_수;

import java.util.Arrays;
import java.util.Comparator;

class Solution {
    public String solution(int[] numbers) {
        String[] result = new String[numbers.length];

        for(int i=0; i<numbers.length; i++){
            result[i] = String.valueOf(numbers[i]);
        }
        for(String arg : result){
            System.out.println("arg : "+arg);
        }

        Arrays.sort(result, new Comparator<String>(){
            @Override
            public int compare(String o1, String o2) {
                System.out.println("o1 : "+o1+" / o2 : "+o2);
                return ((o2 + o1).compareTo(o1 + o2));
                // 내림차순 정렬 
            }
        });
        
        // 첫번째 값이 0이면 값은 0이므로 0을 리턴
        if(result[0].equals("0")) return "0"; 

        for(String arg : result) System.out.println("result : "+arg);

        // 내림차순으로 정렬된 값들을 차례대로 answer에 붙임
        // (문자열을 합칠 때 StringBuilder를 사용하면 성능 향상)
        String answer = "";
        for(String a : result) answer += a; 
        
        return answer;
    }
}
