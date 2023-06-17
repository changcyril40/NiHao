import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PutClass {
    public void putin() {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> putAnyKey = new ArrayList<>();
        while (true){
            String putIn = scan.next();
            putAnyKey.add(putIn);
            if(scan.next().equals("ext"))break;
        }
        System.out.println(putAnyKey);
    }
    public void putin1(){
        System.out.println("请输入字符串，输入\"exit\"结束输入：");
        ArrayList<String> strings = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            strings.add(input);
        }

        System.out.println("输出字符串：");
        for (String str : strings) {
            System.out.println(str);
        }
    }
}
