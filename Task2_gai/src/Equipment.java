public class Equipment {
    private String name;//英雄名字
    private double hp;//生命值
    private double atk;//攻击力
    private double def;//防御力
    private double crit;//暴击率
    private double critdam;//爆伤
    private double Maxhp;//最大生命值
    private double defbroke;//穿甲

    public Equipment (String name , double hp , double Maxhp , double def , double atk , double defbroke , double crit , double critdam){
        this.name = name;
        this.hp = hp;
        this.Maxhp = Maxhp ;
        this.def = def;
        this.atk = atk;
        this.defbroke = defbroke;
        this.crit = crit;
        this.critdam = critdam;
    }

//    Equipment equipment1 = new Equipment("阿莫斯之弓",0.0 , 0.0, 0.0, 0.4, 3.0, 0.5, 1.0);
//    Equipment equipment2 = new Equipment("贯虹之槊",0.5 , 0.5, 0.8, 0.2, 0, 0.2, 0);
//    Equipment equipment3 = new Equipment("苍古自由之誓",0.0 , 0.0, 0.6, 0.4 , 5.0, 0.0, 0.0);
//    Equipment equipment4 = new Equipment("冬极白星",0.0 , 0.0, 0.0, 0.5 , 0.5, 0.5 , 0.6);
//    Equipment equipment5 = new Equipment("松籁响起之时",0.0  , 0.0, 0.0, 0.2, 4.0, 0.4,1.2);
//    Equipment equipment6 = new Equipment("狼的末路",0.0  , 0.0, 0.4, 0.8, 0, 0,0.05);
//    Equipment equipment7 = new Equipment("终末嗟叹之诗",0.25  , 0.25, 0.3, 0.0, 0.0, 0.1,0.1 );
//    Equipment equipment8 = new Equipment("不灭月华",0.3  , 0.3, 0.65, 0.1, 0.0, 0.0,0.0);
//    Equipment equipment9 = new Equipment("护摩之杖",0.2  , 0.2, 0.0, 0.3, 0.0, 0.3,1.5);
//    Equipment equipment10 = new Equipment("薙草之稻光",0.0  , 0.0, 0.4, 0.15, 3.0, 0.5,0.85);

    public String getName(){
        return name;
    }

    public double getHp(){
        return hp;
    }

    public double getAtk(){
        return atk;
    }

    public double getMaxhp(){
        return Maxhp;
    }

    public double getDef(){
        return def;
    }

    public double getCrit(){
        return crit;
    }

    public double getDefbroke(){
        return defbroke;
    }

    public double getCritdam (){
        return critdam;
    }

//    public Equipment getEquipment1(){
//        return equipment1;
//    }
//
//    public Equipment getEquipment2(){
//        return equipment2;
//    }
//
//    public Equipment getEquipment3(){
//        return equipment3;
//    }
//
//    public Equipment getEquipment4(){
//        return equipment4;
//    }
//
//    public Equipment getEquipment5(){
//        return equipment5;
//    }
//
//    public Equipment getEquipment6(){
//        return equipment6;
//    }
//
//    public Equipment getEquipment7(){
//        return equipment7;
//    }
//
//    public Equipment getEquipment8(){
//        return equipment8;
//    }
//
//    public Equipment getEquipment9(){
//        return equipment9;
//    }
//
//    public Equipment getEquipment10(){
//        return equipment10;
//    }

}
