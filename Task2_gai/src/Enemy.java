import java.util.Scanner;

public class Enemy extends Role {
    Scanner in = new Scanner(System.in);
    int  hp;
    int  atk;
    int  def;
    int  Maxhp;

    public void buildEnemys(){

        do {
            System.out.println("请输入敌人生命值属性(1000 <= 生命值 <= 5000)：");
            hp = in.nextInt();
            Maxhp = hp;
        }while(hp > 5000 || hp < 1000);

        do {
            System.out.println("请输入敌人攻击力属性(40 <= 攻击力 <= 200)：");
            atk = in.nextInt();
        }while(atk > 200 || atk < 40);

        do {
            System.out.println("请输入敌人防御力属性(60 <= 防御力 <= 200)：");
            def = in.nextInt();
        }while(def > 200 || def < 60);
        build("敌人属性系数", hp , Maxhp , atk , def ,10,10,50);

    }

    public void show(){
        System.out.println("敌人的成分是："+getName()+"\n敌人最大生命值为："+getHp()+"\n敌人攻击力为："+getAtk()+"\n敌人防御力为："+getDef());
        System.out.println("敌人的暴击率为："+getCrit()+"%\n敌人的暴击伤害矫正系数为："+getCritdam() + "%\n敌人的防御力无视数值为："+getDefbroke());
    }

    //建立敌人属性
    public Enemy (String name , int hp , int Maxhp , int def , int atk , int defbroke , int crit , int critdam){
        setName(name);
        setHP(hp);
        setMaxHP(hp);
        setATK(atk);
        setDefense(def);
        setCrit(crit);
        setCritdamage(critdam);
        setDefbroke(defbroke);
    }

    public void setupenemies(Enemy enemy , String name , int lv){
        setName(name);
        setHP(enemy.getHp() * lv);
        setMaxHP(enemy.getMaxhp() * lv);
        setDefense(enemy.getDef() * lv);
        setATK(enemy.getAtk() * lv);
        setDefbroke(enemy.getDefbroke() * lv);
        setCrit(enemy.getCrit() * lv);
    }

    //用于强化敌人
    public void evolveenemies(Enemy enemy , int evolelv){
        setName(enemy.getName());
        setHP(enemy.getHp() * evolelv);
        setATK(enemy.getAtk() * evolelv);
        setMaxHP(enemy.getMaxhp() * evolelv);
        setDefbroke(enemy.getDefbroke() * evolelv);
        setCrit(enemy.getCrit() * evolelv);
        setCritdamage(enemy.getCritdam() * evolelv);
        setDefense(enemy.getDef() * evolelv);
    }
}