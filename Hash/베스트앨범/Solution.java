package Hash.베스트앨범;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Solution {
     
    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};
        return answer;
    }

    public static void main(String[] args) {
        int[] answer = {};
        String[] genres = {"classic","pop","classic","classic","pop"};
        int[] plays = {500,600,150,800,2500};

        ArrayList<Integer> arrAnswer = new ArrayList<Integer>();
        HashMap<String, Integer> hmGenres = new HashMap<>();
          for(int i =0; i< genres.length; i++){
             hmGenres.put(genres[i], hmGenres.getOrDefault(genres[i],0)+plays[i]);
        }
         
        List<String> keySetList = new ArrayList<>(hmGenres.keySet());
        Collections.sort(keySetList, (o1, o2) -> (hmGenres.get(o2).compareTo(hmGenres.get(o1)))); // 내림차순으로 정렬
        
        System.out.println(keySetList.get(0));
        System.out.println(keySetList.get(1));
        
        // 장르 내 많이 재생된 노래 먼저 수록
        // 장르 내 재생횟수 같으면 고유 번호 낮은 노래 먼저 수록
    }
}