public class ClaInt {
    public void xiangJia(int...num){
        int j = 0;
        for(int i = 0;i < num.length;i++ ){
            j+=num[i];
        }
        System.out.println(j);
    }
}
