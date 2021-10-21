

public class level1 {

    //打印99乘法表
    public static void sf() {
        for(int i = 1 ; i <= 9 ; i ++){
            for ( int j = 1 ; j <= i ; j ++){
                System.out.printf(j + " " + "*"+ " " + i  + " " + "=" + i*j+ "\t\t");
            }
            System.out.println();
        }
    }

    //打印五角星
    public static void star(){
        char a = '-';
        char b = '*';

        //输出顶部三角形
        for (int i = 1 ; i <= 6 ; i ++){
            for(int j = 1 ; j <= 69 ; j++){
                if(j <= 35 - i||j >= 35 + i){
                    System.out.print(a);
                }else{
                    System.out.print(b);
                }
            }
            System.out.println();
        }

        //输出倒梯形
        for (int i = 1 ; i <= 4 ; i ++){
            for (int j = 1 ; j <= 69 ; j++){
                if (j > 13 + 4 * (i - 1) && j < 57 - 4 * (i - 1)){
                    System.out.print(b);
                }else{
                    System.out.print(a);
                }
            }
            System.out.println();
        }

        //输出最底部梯形扣去三角形
        for (int i = 1 ; i <= 8 ; i++){
            for (int j = 1 ; j <= 69 ; j ++){
                if (j > 25 - i && j < 44 + i){
                   if (i <= 2){
                       System.out.print(b);
                   }else{
                       if((j >= 35 - 3 * (i - 3) && j <= 34 + 3 * (i - 3)) || j == 35){
                           System.out.print(a);
                       }else{
                           System.out.print(b);
                       }
                   }
                }else{
                    System.out.print(a);
                }
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        sf();
        System.out.println("\n"+"\n");
        star();
    }
}






