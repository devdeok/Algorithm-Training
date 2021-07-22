package level_2.단체사진_찍기;

import java.util.HashMap;

public class Solution {
    HashMap<Integer,Character> friends = new HashMap<>();
    int cnt = 0;

    public int solution(int n, String[] data) {
        boolean[] isVisited = new boolean[8];

        friends.put(0, 'A');
        friends.put(1, 'C');
        friends.put(2, 'F');
        friends.put(3, 'J');
        friends.put(4, 'M');
        friends.put(5, 'N');
        friends.put(6, 'R');
        friends.put(7, 'T');
        
        perm("",data,isVisited);
        return cnt;
    }

    // 조건 배열, 주소, 경우의 수 
    void perm(String order,String[] data,boolean[] isVisited){

        if(order.length() == friends.size()){
            if(isOk(order, data)) cnt++;
            return;
        }

        for(int i=0; i<friends.size();i++){
            if(!isVisited[i]){
                isVisited[i] = true;
                perm(order + friends.get(i), data, isVisited);
                isVisited[i] = false;
            }
        }
    }

    boolean isOk(String order, String[] data){
        for(String str : data){
            int pos1 = order.indexOf(str.charAt(0));
            int pos2 = order.indexOf(str.charAt(2));
            char op = str.charAt(3);
            int diff = str.charAt(4) - '0'; // 아스키코드 0 : 48
            
            if(op == '='){
                if(Math.abs(pos1-pos2) != diff+1)
                    return false;
            }
            else if (op == '>'){
                if(Math.abs(pos1-pos2) <= diff+1)
                    return false;
            }
            else if (op == '<'){
                if(Math.abs(pos1-pos2) >= diff+1)
                    return false;
            }
        }
        //조건이 맞으면 ture
        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int n = 2;
        // N과 F가 간격이 0, R과 T가 간격이 2보다 큼

        // 3648
        String[] data = {"N~F=0","R~T>2"};

        // 0
        // String[] data = {"M~C<2","C~M>1"};

        // 경우의 수 : 3648
        System.out.println(s.solution(n, data));
    }
}