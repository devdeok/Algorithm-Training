package 완전탐색.소수찾기;

import java.util.HashSet;

public class Solution {
    public int solution(String numbers) {
        HashSet<Integer> set = new HashSet<>();
        
        permutation("", numbers, set); // 순열
        
        int cnt = 0;
        while(set.iterator().hasNext()){ //set에서 다음 원소가 있는지?
            int a = set.iterator().next(); // a에 set에 있는 다음 원소를 넣어줌
            set.remove(a); // a에 넣은 원소는 set에서 삭제
            if(a==2) cnt++; // a가 2이면 소수이므로 cnt를 하나 증가
            if(a%2 != 0 && isPrime(a)) // a가 2와 나누었을 때 0이 되지 않고 소수를 판별했을 때 참이면 cnt를 하나 증가 
                cnt++;
        }
        return cnt;
    }

    // 소수 판별
    public static Boolean isPrime(int number){
        if(number <= 1) return false;
        for(int i=2; i*i<=number; i++){
            if(number%i == 0) return false;
        }
        return true;
    }

    // 순열
    public static void permutation(String prefix, String str, HashSet<Integer> set){
        int n = str.length();  
        // System.out.println(prefix);

        if(!prefix.equals("")){ // 접두사가 ""이 아니면 set에 Integer형으로 추가
            set.add(Integer.valueOf(prefix));
        }

        for(int i=0;i<n;i++){ 
            permutation(prefix+str.charAt(i),
                        str.substring(0, i)+str.substring(i+1, n),
                        set);
        }
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String numbers = "011";
        System.out.println(s.solution(numbers));
    }
}

