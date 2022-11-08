package RecursionPractice;

public class DisplayString {
    public String displayString(String str, int n){
        if (n < 2){
            return str;
        }
        else{
            return str + displayString(str,n-1);
        }
    }
}
