import java.security.PublicKey;
import java.util.Scanner;

public class Hero extends Role {
    Scanner in = new Scanner(System.in);

    public void buildhero(){
        String name;
        int  hp;
        int  atk;
        int  def;
        int  Maxhp;
        int  crit;
        int  critdamage;
        Equipment[] elements = new Equipment[6];

        System.out.println(/*是否进入God模式？\n1.进入   2.不进入*/ "按enter键继续" );//为了好检验后面的情况先搞一个God模式
        String flag;
        flag = in.nextLine();
        if (flag.equals("1")){
            do {
                System.out.println("请输入你的英雄名字(不超过20个字符)：");
                name = in.next();
            }while(name.length() > 20 || name.length() == 0);
            hp = 0Xffffff;
            atk = 0Xffffff;
            def = 0Xffffff;
        }else {
            do {
                System.out.println("请输入你的英雄名字(不超过20个字符)：");
                name = in.next();
            } while (name.length() > 20 || name.length() == 0);

            do {
                System.out.println("请输入你的英雄生命值(100000 <= 生命值 <= 200000)：");
                hp = in.nextInt();
                Maxhp = hp;
            } while (hp > 200000 || hp < 100000);

            do {
                System.out.println("请输入你的英雄攻击力(500 <= 攻击力 <= 2000)：");
                atk = in.nextInt();
            } while (atk > 2000 || atk < 500);

            do {
                System.out.println("请输入你的英雄防御力(500 <= 防御力 <= 2000)：");
                def = in.nextInt();
            } while (def > 2000 || def < 500);
        }
        build(name , hp , hp , def , atk , 10 ,10 , 50);
    }

    public void show(){
        System.out.println("你的英雄名字是："+getName()+"\n你的英雄最大生命值为："+getMaxhp()+"\n你的英雄攻击力为："+getAtk()+"\n你的英雄防御力为："+getDef());
        System.out.println("英雄的暴击率为："+getCrit()+"%\n英雄的暴击伤害矫正系数为："+getCritdam() + "%\n英雄的防御力无视数值为："+getDefbroke());
    }

    public void getproperty(Hero hero){
        setName(hero.getName());
        setATK(hero.getAtk());
        setDefbroke(hero.getDefbroke());
        setCrit(hero.getCrit());
        setCritdamage(hero.getCritdam());
        setDefense(hero.getDef());
        setHP(hero.getHp());
        setMaxHP(hero.getMaxhp());
    }

    //穿上装备
    public void equipon(Equipment equipment , Hero property/*用于记录基础属性值*/ , Hero hero){
        int hp; int Maxhp; int atk; int def; int defbroke; int crit; int critdam;//记录每次的变化量
        hp =(int)(equipment.getHp() * property.getHp()) + hero.getHp();
        Maxhp =(int)(equipment.getMaxhp() * property.getMaxhp()) + hero.getMaxhp();
        atk =(int)(equipment.getAtk() * property.getAtk()) + hero.getAtk();
        def =(int)(equipment.getDef() * property.getDef()) + hero.getDef();
        defbroke =(int)(equipment.getDefbroke() * property.getDefbroke()) + hero.getDefbroke();
        crit =(int)(equipment.getCrit() * property.getCrit()) + hero.getCrit();
        critdam =(int)(equipment.getCritdam() * property.getCritdam()) + hero.getCritdam();
        build(hero.getName() , hp , Maxhp ,def,  atk  , defbroke , crit , critdam);
    }

    //脱下装备
    public void equipdown(Equipment equipment , Hero property/*用于记录基础属性值*/ , Hero hero){
        int hp; int Maxhp; int atk; int def; int defbroke; int crit; int critdam;//记录每次的变化量
        Maxhp = hero.getMaxhp() - (int)(equipment.getMaxhp() * property.getMaxhp());
        atk =hero.getAtk() - (int)(equipment.getAtk() * property.getAtk());
        def =hero.getDef() - (int)(equipment.getDef() * property.getDef());
        defbroke =hero.getDefbroke() - (int)(equipment.getDefbroke() * property.getDefbroke());
        crit =hero.getCrit() - (int)(equipment.getCrit() * property.getCrit());
        critdam = hero.getCritdam() - (int)(equipment.getCritdam() * property.getCritdam());
        if (hero.getHp() >= Maxhp){
            hp = Maxhp;
        }else {
            hp = hero.getHp();
        }
        build(hero.getName() , hp , Maxhp , def , atk , defbroke , crit , critdam);
    }
}




