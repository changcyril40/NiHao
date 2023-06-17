import java.util.Scanner;

public class Pattern616 {
    Scanner scan = new Scanner(System.in);
    public int pattern(String x){
        if(x.matches("-?\\d+")){
           int a = Integer.parseInt(x);
           return a;
        }else return 0;
    }
}

