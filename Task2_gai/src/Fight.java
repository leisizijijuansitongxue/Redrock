import java.util.Random;

public class Fight {

    //战斗判断方法
    public int damamge(int atk , int def , int crit , int defbroke , int critdam , Skills skills){
        int dam = atk;
        int a;

        dam = (int)(((skills.getSkillsupatk() ) * atk)*(100/((100 + def - defbroke - skills.getSkillsdefbroke())*1.0)+1));
        if (dam <= 0)
        if (Math.random()*100 <= crit ){
            dam = Critdam(critdam , dam);
        }
        return dam;
    }

    //暴击后伤害伤害矫正
    public static int Critdam(int critdam , int dam){
        dam = (int)( dam * ( 100 + critdam * 1.0 ) / 100 );
        return dam;
    }

    //返回战斗结果
    public void result(String name1 , String name2 , int dam , Skills skills){
        System.out.print(/*"本回合中 " + */ name1 + " 使用 " + skills.getSkillsname() + " 对 " + name2 + " 造成了 " + dam + " 点伤害");
    }



}
