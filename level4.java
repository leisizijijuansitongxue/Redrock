//plus目标：
//1.实现点菜功能成为方法，加入到Restaurant中
//2.实现菜单的增删；



import java.util.Scanner;

class Restaurant {

    private String name = "万民堂";

    //欢迎词
    public void welcome(){
        System.out.println("欢迎光临"+ this.name+"\n");
        System.out.println("这是今天的菜单");
    }

    //支付方法
    public void pay(int a) {
        if(a == 1){
            System.out.println("请出示微信付款码");
        }
        if (a == 2){
            System.out.println("请出示支付宝付款码");
        }
        if (a == 3){
            System.out.println("就你还想刷脸？你还有脸吗？");
        }
    }
}

class Menu{
    //实现数据的储存
    private String name;
    private double price;
    private int num;

    public Menu(int num , String name , double price ){
        this.name = name;
        this.price = price;
        this.num = num;
    }

    //实现数据的读取
    public int getNum(){
        return num;
    }

    public String getName(){
        return name;
    }

    public double getPrice(){
        return price;
    }
}

public class level4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Restaurant a = new Restaurant();
        a.welcome();
        double sum = 0;

        byte flag = 0;
        int flag1 = 0;
        int[] courses = new int [1000];

        Menu[] menu = new Menu[6];
        menu[0] = new Menu(1 ,"仙跳墙" , 3399);
        menu[1] = new Menu(2 ,"腌笃鲜" , 888);
        menu[2] = new Menu(3 ,"盛世太平" , 1314);
        menu[3] = new Menu(4 ,"雷神杂烩" , 200000);
        menu[4] = new Menu(5 ,"金丝虾球" , 7777);
        menu[5] = new Menu(6 ,"夏祭游鱼" , 4396);

        while(flag == 0){

            byte flag2 = 0;
            System.out.println("序号"+"\t\t"+"菜名"+"\t\t\t"+"价格");
            for (int i = 0 ; i < 6 ; i ++) {
                System.out.println(menu[i].getNum() + "\t\t" + menu[i].getName() + "\t\t" + menu[i].getPrice());
            }

            System.out.println();
            System.out.println("是否点菜？"+"\n"+"yes"+"\t"+"no");
            System.out.println();
            while (flag2 == 0){
                String b = in.next();
                if (b.equals("yes")||b.equals("no")){
                    if(b.equals("yes")){
                        flag2 = 1 ;
                    }
                    if (b.equals("no")){
                        flag2 = 2;
                    }
                }else{
                    System.out.println("请输入yes或者no");
                }
            }

            if (flag2 == 2){
                break;
            }


            System.out.println();
            System.out.println("请输入你想点的菜的序号");
            byte course ;
            course = in.nextByte();
            if (course <= 6){
                sum = menu[course-1].getPrice() + sum;
                courses[flag1] = course;
                flag1++;
            }else{
                System.out.println("请输入1~6的序号");
            }
            System.out.println("您现在一共点了：");
            System.out.println();
            for (int i = 0 ; i < flag1 ; i++){
                System.out.println(menu[courses[i] - 1].getNum() + "\t\t" +
                        menu[courses[i] - 1].getName() + "\t\t" + menu[courses[i] - 1].getPrice());
            }
            System.out.println("总计："+sum);
            System.out.println();

        }

        System.out.println();
        System.out.println("您一共消费："+"\t"+sum);
        System.out.println();
        System.out.println("请选择支付方式：" + "\n" + "1.  微信" + "\n" + "2.  支付宝" + "\n" + "3.  刷脸支付");
        int method = in.nextInt();
        a.pay(method);
    }
}



