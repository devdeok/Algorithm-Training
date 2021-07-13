package kakaopay_2021.p2;

public class Solution {
    public int[] solution(int rows, int columns, int[][] swipes){
        // swipe는 1 r1 c1 r2 c2 로 구성됨
        // d는 방향을 나타내며 1:하, 2:상, 3:우, 4:좌 
        int[] answer = {};

        int[][] array = new int[rows][columns];
        int num = 1;
        for(int i=0; i<rows; i++){
            for(int j=0; j<columns; j++){
                array[i][j] = num;
                num++;
            }
        } // 첫 배열

        int size = 0;
        for(int x=0; x<swipes.length; x++){
            answer = new int[x]; // 리턴할 결과값 배열

            int[] arr = {}; // 원소를 옮길 때 필요한 배열 
            // 배열의 크기를 알맞게 선언
            switch(swipes[x][0]){
                case 1 :
                    size = swipes[x][4] - swipes[x][2]+1;
                    arr = new int[size];
                case 2 : 
                    size = swipes[x][4] - swipes[x][2]+1;
                    arr = new int[size];
                case 3 :
                    size = swipes[x][3] - swipes[x][1]+1;
                    arr = new int[size];
                case 4 :
                    size = swipes[x][3] - swipes[x][1]+1;
                    arr = new int[size];
            }


            
            

            // 해당 index의 result값
            for(int arg : arr) answer[x] += arg;
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int rows = 4;
        int columns = 3;
        int[][] swipes = {{1,1,2,4,3,},{3,2,1,2,3},{4,1,1,4,3},{2,2,1,3,3}};

        // result [23,3,21,9]
        System.out.println(s.solution(rows, columns, swipes));
    }
    
}
