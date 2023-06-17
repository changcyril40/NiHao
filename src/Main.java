import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Pattern616 patt = new Pattern616();
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        System.out.println(patt.pattern(a));
    }
}