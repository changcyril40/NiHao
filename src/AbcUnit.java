public class AbcUnit {
    public void abcJia(int x,int y,int z){
        x+=20;
        y+=20;
        z+=20;
        System.out.println(x + "," + y + "," + z);
    }
    public void JiaoHuan(int a,int b){
        int temp = a;
        a = b;
        b = temp;
    }
    public int getSum1(int sum){
        if(sum == 1){
            return 1;
        }else {
            return getSum1(sum-1)+sum;
        }
    }
    public boolean b(int x){
        if(x >=60){
            return true;
        }else return false;
    }
}
