package RecursionPractice;

public class GetNumberOfZerosLoop {
    public int getNumberOfZerosLoop(int n){
        int zeros = 0;
        while(n != 0){
            if(n % 10 == 0){
                zeros++;
            }
            n = n/10;
        }
        return zeros;
    }
}
