import java.util.stream.IntStream;
import java.util.stream.Stream;

public class test{
    int[] a = {1,2,3,4};
    int[] b = {-3,-1,0,2};

    public int solution(int[] a, int[] b) {
        int answer = 1234567890;
        for(int i=0;i<a.length;i++){
            answer = answer + (a[i]*b[i]);
        }
        return answer;
    }
    /*
    return IntStream.range(0, a.length)
                    .map(index -> a[index] * b[index])
                    .sum();
    */
    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {-3,-1,0,2};
        IntStream[] temps = new IntStream[4];
        int temps2 = 0;
        for(int i = 0;i<a.length;i++){
           temps[i] = IntStream.range(0, a.length).map(index -> a[index] * b[index]);
           
        }
        temps2 = IntStream.range(0, a.length).map(index -> a[index] * b[index]).sum();

        System.out.println(temps2);

        for(IntStream temp : temps){
            System.out.println(temp);
        }
    }

}
