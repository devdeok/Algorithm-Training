package level_2.오픈채팅방;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

class Solution{
    public String[] solution(String[] record) {
        ArrayList<String> answer = new ArrayList<>();
        String[][] temp = new String[record.length][];
        Map<String, String> uidName = new HashMap<>();

        // 2차원 배열에 각 문자열을 삽입하면서 uid와 name을 매핑
        for(int i=0; i<record.length; i++){
            temp[i] = record[i].split(" ");
            
            if(temp[i][0].equals("Enter"))
                uidName.put(temp[i][1], temp[i][2]);
            else if(temp[i][0].equals("Change"))
                uidName.replace(temp[i][1], temp[i][2]);
        }

        for(int i=0; i<record.length; i++){
            if(temp[i][0].equals("Enter"))
                answer.add(uidName.get(temp[i][1])+"님이 들어왔습니다.");
            else if(temp[i][0].equals("Leave"))
                answer.add(uidName.get(temp[i][1])+"님이 나갔습니다.");
        }

        return answer.toArray(new String[answer.size()]);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        String[] record = {"Enter uid1234 Muzi",
                            "Enter uid4567 Prodo",
                            "Leave uid1234",
                            "Enter uid1234 Prodo",
                            "Change uid4567 Ryan"};
        // Prodo님이 들어왔습니다. (Muzi -> Prodo)
        // Ryan님이 들어왔습니다. (Prodo -> Ryan)
        // Prodo님이 나갔습니다. (Muzi -> Prodo)
        // Prodo님이 들어왔습니다.
        System.out.println("정답 : "+s.solution(record));
        for(String arg : s.solution(record)){
            System.out.println(arg);
        }
    }
}