public class R {
    public void mianJI(int...r){
        int i = r.length;
            if(i == 1){
                System.out.println("圆形面积是" + 3.14*r[0]*r[0]);
            }else if(i == 2){
                System.out.println("矩形面积是"+r[0]*r[1]);
            }else if(i ==3){
                System.out.println("sa");
            }
        }
    public void mianJI1(int...r){
        int i = r.length;
        switch (i){
            case (1):
            System.out.println("圆形面积是" + 3.14*r[0]*r[0]);
            break;
            case (2):
            System.out.println("矩形面积是"+r[0]*r[1]);
            break;
            case (3):
            System.out.println("sa");
            break;
        }
    }
}
