package RecursionPractice;

public class GetPowerOfTenLoop {
    public long getPowerOfTenLoop(int n){
        long ans = 1;
        while(n != 0){
            ans = ans * 10;
            n--;
        }
        return ans;
    }
}
