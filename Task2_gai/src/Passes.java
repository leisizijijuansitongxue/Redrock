import javax.swing.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Passes{
    ArrayList<Enemy> enemies = new ArrayList<Enemy>();
    String[] enemylevel = new String[] {"近战兵" , "远程兵" , "炮车兵" , "超级兵" , "坚韧黑铁" , "英勇黄铜" , "不屈白银" , "荣耀黄金" , "华贵铂金" , "璀璨钻石" , "超凡大师" , "傲世宗师" , "最强王者" , "Faker"};
    int Maxlevel = 14;//对战总数
    Enemy enemyproperty = new Enemy("",0,0,0,0,0,0,0);
    Enemy enemy = new Enemy("",0,0,0,0,0,0,0);
    Hero heroproperty = new Hero();
    Hero hero = new Hero();
    Combat combat = new Combat();
    Equipment equipment = new Equipment("" ,0,0,0,0,0,0,0);
    Getequipments which = new Getequipments();
    Fight fight = new Fight();

    public void startfight(){
        Scanner in = new Scanner(System.in);

        System.out.println("专为Moba萌新设计的Moba关卡训练");
        System.out.println("只要你能通关本训练系统你就还是会对Moba毫无了解");
        System.out.println("温馨提示：难度设置太高你将无法通关");
        System.out.println("请输入你想体验的难度(这会使得敌人强度全方位增加)：\n1.适应\t2.简单\t3.一般\t4.困难\t5.地狱\t6.不可能的挑战");
        int upsetpower = in.nextInt();
        while(((upsetpower != 1&&upsetpower != 2) && (upsetpower != 3 && upsetpower != 4))&&(upsetpower != 5 && upsetpower != 6)){
            System.out.println("请输入正确的难度系数...");
            upsetpower = in.nextInt() ;
        }

        //创建敌人和英雄
        heroproperty.buildhero();
        hero.getproperty(heroproperty);
        enemyproperty.buildEnemys();
        hero.show();
        enemy.show();


        //难度自定义
        enemyproperty.evolveenemies(enemyproperty , upsetpower);

        int level = 1;
        System.out.println("下面你将会从废铁一直打上王者！！！");
        System.out.println("开始你的战斗之旅吧！！！！");
        for (level = 1 ; level <= Maxlevel  ; level ++) {//建立关卡
            System.out.println("这是第 " + level + " 次战斗");
            if (level < 14) {
                for (int i = 0; i <= 4; i++) {
                    enemy.setupenemies(enemyproperty, enemylevel[level - 1], level * 2);
                    enemies.add(new Enemy(enemylevel[level - 1], enemy.getHp(), enemy.getMaxhp(), enemy.getDef(), enemy.getAtk(), enemy.getDefbroke(), enemy.getCrit(), enemy.getCritdam()));
                }
            } else {
                if (level == 14) {
                    enemy.setupenemies(enemyproperty, enemylevel[level - 1], 300);
                    enemies.add(new Enemy(enemylevel[level - 1], enemy.getHp(), enemy.getMaxhp(), enemy.getDef(), enemy.getAtk(), enemy.getDefbroke(), enemy.getCrit(), enemy.getCritdam()));
                }
            }
            while (hero.getHp() > 0 && enemies.size() != 0) {
                combat.printRoles(hero);
                System.out.println();
                for (int i = 1; i <= enemies.size(); i++) {
                    System.out.print("第 " + i + " 个位置是");
                    combat.printRoles(enemies.get(i - 1));
                }
                Scanner input = new Scanner(System.in);
                int position = 100;
                while (position > enemies.size() || position <= 0) {
                    System.out.println("请输入你想要攻击的敌方角色位置编号：");
                    position = input.nextInt();
                }
                combat.heroattack(hero, enemies.get(position - 1));
                if (enemies.get(position - 1).getHp() <= 0) {
                    enemies.remove(position - 1);
                }
                for (int time = 1; time <= enemies.size(); time++) {
                    combat.enemyattack(enemies.get(time - 1), hero);
                }
            }
            if (hero.getHp() <= 0) {
                break;
            }

            System.out.println("恭喜通过第 " + level + " 次战斗");
            if (level % 2 == 0) {
                equipment = which.getequipments();
                System.out.println("恭喜你获得装备[ " + equipment.getName() + " ],现在你的英雄有了那么一点提升");
                System.out.println("提升前：");
                hero.show();
                hero.equipon(equipment , heroproperty , hero);
                System.out.println("提升后： ");
                hero.show();
            }
        }
            System.out.println("\n\n");
            if (hero.getHp() <= 0) {
                System.out.println("你果然还是太菜了，这都打不过？！？！fw！！");
            } else {
                System.out.println("你怎么可能战胜李哥？？？\n你绝对开挂了，绝对\n还有，想要学Moba就别来玩我这个文字游戏");
                System.out.println("这样你还不如去下一个王者或者lol来了解一下");
            }


    }
}

