package RecursionPractice;

public class GetMultiChar {
    public String getMultiChar(char ch, int n){
        String empty = "";
        if(n < 1){
            empty += ch;
            return empty;
        }
        else{
            return ch + getMultiChar(ch,n-1);
        }
    }
}
