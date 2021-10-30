import java.util.Scanner;

public class Combat {

    Fight fighting = new Fight();
    Skills skills = new Skills("普通攻击" , 0 , 1.0);

    int hp;

    public void skillchose(){

        Skills skill0 = new Skills ("普通攻击" , 0 , 1.0);
        Skills skill1 = new Skills ("剑光如我，斩尽芜杂", 20 , 3.6);
        Skills skill2 = new Skills ("吃饱喝好，一路走好！！", 40, 3.2 );
        Skills skill3 = new Skills ("冰浪怒涛", 0 , 4.0 );
        Skills skill4 = new Skills ("悲鸣吧",60  , 2.6 );
        Skills skill5 = new Skills ("如琉璃般飘落", 80 , 2.2 );
        Skills skill6 = new Skills ("此乃，天道!!!!!", 40 , 2.5 );
        Skills skill7 = new Skills ("在此！！宣判！！", 100 , 1.8 );
        Skills skill8 = new Skills ("别想投胎哦", 120 , 1.4 );
        Skills skill9 = new Skills ("奥义-梦想真说"  , 140 , 1.0);

        System.out.println("请输入你想要使用的攻击方式：");
        System.out.println("1. 普通攻击 ");
        System.out.println("2. 技能： 剑光如我，斩尽芜杂");
        System.out.println("3. 技能：吃饱喝好，一路走好！！");
        System.out.println("4. 技能：冰浪怒涛");
        System.out.println("5. 技能：悲鸣吧");
        System.out.println("6. 技能：如琉璃般飘落");
        System.out.println("7. 技能：此乃，天道!!!!!");
        System.out.println("8. 技能：在此！！宣判！！");
        System.out.println("9. 技能：别想投胎哦!!");
        System.out.println("10. 技能：奥义-梦想真说");
        Scanner inputskills = new Scanner(System.in);

        int num = inputskills.nextInt();

        switch (num) {
            case 1: {
                skills = skill0;
                break;
            }
            case 2: {
                skills = skill1;
                break;
            }
            case 3: {
                skills = skill2;
                break;
            }
            case 4: {
                skills = skill3;
                break;
            }
            case 5: {
                skills = skill4;
                break;
            }
            case 6: {
                skills = skill5;
                break;
            }
            case 7: {
                skills = skill6;
                break;
            }
            case 8: {
                skills = skill7;
                break;
            }
            case 9: {
                skills = skill8;
                break;
            }
            case 10: {
                skills = skill9;
                break;
            }
            default:{
                skills = skill0;
                break;

            }
        }
    }

    public void heroattack(Hero hero , Enemy enemy){

        int dam;
        skillchose();
        dam = fighting.damamge(hero.getAtk(),enemy.getDef(),hero.getCrit(),hero.getDefbroke(),hero.getCritdam(),skills);
        dam =(int)(dam * (1 - (Math.random() - 0.5)/50));//伤害上下浮动1%
        if (dam <= 0){//防止换为整形出现0
            dam = 1;
        }
        hp = enemy.getHp() - dam;
        enemy.setHP(hp);
        fighting.result(hero.getName() , enemy.getName() , dam , skills);
        if (enemy.getHp() <= 0 ){
            System.out.println("( "+ enemy.getName() +" 已经被 "+ hero.getName()+" 击败)");
        }else{
            System.out.println();
        }
    }

    //小兵不配拥有技能。(>_<)。
    public void enemyattack(Enemy enemy , Hero hero){
        int dam;
        Skills skills = new Skills("普通攻击" , 0 , 1.0);
        dam = fighting.damamge(enemy.getAtk(),hero.getDef(),enemy.getCrit(),enemy.getDefbroke(),enemy.getCritdam(),skills);
        dam =(int)(dam * (1 - (Math.random() * 1 - 0.5)/50));//伤害上下浮动1%
        if (dam <= 0){//防止换为整形出现0
            dam = 1;
        }
        hp = hero.getHp() - dam;
        hero.setHP(hp);
        fighting.result( enemy.getName() , hero.getName() ,dam , skills);
        if (hero.getHp() <= 0 ){
            System.out.println("( "+ hero.getName() +"已经被 "+ enemy.getName() + " 击败)");
        }else{
            System.out.println();
        }
    }

    //打印血条
    public void printRoles(Role role){
        System.out.println(role.getName() + " 生命值: " + role.getHp() + " / " + role.getMaxhp());
        int num;
        num =(int)(80 * role.getHp() / role.getMaxhp() * 1.0);
        for (int i = 1 ; i<= num ; i++){
            System.out.print("█");
        }
        for (int i = num ; i < 80 ; i ++){
            System.out.print("▕");
        }
        System.out.println();
    }
}
