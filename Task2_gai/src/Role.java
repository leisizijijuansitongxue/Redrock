public class Role {


    private String name;//英雄名字
    private int hp;//生命值
    private int atk;//攻击力
    private int def;//防御力
    private int crit;//暴击率
    private int critdam;//爆伤
    private int Maxhp;//最大生命值
    private int defbroke;//穿甲
//    private int exp;
//    private int lv;
//    private int Maxexp;
//    private final int Exp1 = 100;
//    private final int Exp2 = 500;
//    private final int Exp3 = 900;
//    private final int Exp4 = 1600;
//    private final int Exp5 = 3000;//并不打算搞这玩意现在，太难了QAQ

    public void setName(String name) {
        this.name = name;
    }

    public void setHP(int hp) {
        this.hp = hp;
    }

    public void setMaxHP(int Maxhp) {
        this.Maxhp = Maxhp;
    }

    public void setATK(int atk) {
        this.atk = atk;
    }

    public void setDefense(int def) {
        this.def = def;
    }

    public void setCrit(int crit) {
        this.crit = crit;
    }

    public void setCritdamage(int critdam) {
        this.critdam = critdam;
    }

    public void setDefbroke(int defbroke){
        this.defbroke = defbroke;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public int getMaxhp(){return Maxhp;}

    public int getAtk() {
        return atk;
    }

    public int getDef() {
        return def;
    }

    public int getCrit() {
        return crit;
    }

    public int getCritdam() {
        return critdam;
    }

    public int getDefbroke(){
        return defbroke;
    }

    public void build(String name , int hp , int Maxhp , int def , int atk , int defbroke , int crit , int critdam){
        setName(name);
        setHP(hp);
        setMaxHP(Maxhp);
        setATK(atk);
        setDefense(def);
        setCrit(crit);
        setCritdamage(critdam);
        setDefbroke(defbroke);
    }


}
