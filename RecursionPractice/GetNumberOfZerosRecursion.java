package RecursionPractice;

public class GetNumberOfZerosRecursion {
    public int getNumberOfZerosRecursion(int n){
        if(n < 10){
            return 0;
        }
        else{
            return (n%10 == 0 ? 1: 0)+ getNumberOfZerosRecursion(n/10);
        }
    }
}
