package Heap.더_맵게;

import java.util.PriorityQueue;

class Solution{
    public int solution(int[] scoville, int k){
        int count = 0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int i=0; i<scoville.length;i++)
            heap.offer(scoville[i]);

        while(heap.peek()<k){
            if(heap.size()  < 2) return -1;

            int a = heap.poll();
            int b = heap.poll();

            int result = a + (b*2);

            heap.offer(result);
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] scoville = {1,2,3,9,10,12};
        int k = 7;
        
        // return : 2
        System.out.println(s.solution(scoville, k));
    }
}