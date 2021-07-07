package Hash.전화번호목록;

class Solution_1{    
    String[] phone_book={"123","456","789"}; //true;
    //{"119", "97674223", "1195524421"}; // false

    public boolean solution(String[] phone_book) {
        for(int i=0;i<phone_book.length-1;i++){
            for(int j=i+1;j<phone_book.length;j++){
                if(phone_book[i].startsWith(phone_book[j]))
                    return false;
                else if(phone_book[j].startsWith(phone_book[i]))
                    return false;
            }
        }
        
        return true;
    } // 효율성 테스트 3, 4 -> 시간 초과
}